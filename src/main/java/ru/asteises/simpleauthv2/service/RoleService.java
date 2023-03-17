package ru.asteises.simpleauthv2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.asteises.simpleauthv2.mapper.RoleMapper;
import ru.asteises.simpleauthv2.model.dto.RoleDto;
import ru.asteises.simpleauthv2.model.dto.RoleRegDto;
import ru.asteises.simpleauthv2.model.entity.Role;
import ru.asteises.simpleauthv2.repositories.RoleStorage;

import javax.management.relation.RoleNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleStorage roleStorage;

    public void addNewRole(RoleRegDto roleRegDto) {
        Role role = new Role();
        role.setName(roleRegDto.getName());
        roleStorage.save(role);
    }

    public Role getRoleByName(String roleName) throws RoleNotFoundException {
        return roleStorage.findByName(roleName)
                .orElseThrow(RoleNotFoundException::new);
    }

    public RoleDto getRoleById(Long roleId) throws RoleNotFoundException {
        Role role = roleStorage.findById(roleId)
                .orElseThrow(RoleNotFoundException::new);
        RoleDto roleDto = new RoleDto();
        roleDto.setId(role.getId());
        roleDto.setName(role.getName());
        return roleDto;
    }

    public Object getAllRoles() {
        List<Role> roles = roleStorage.findAll();
        return RoleMapper.INSTANCE.map(roles);
    }
}
