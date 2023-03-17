package ru.asteises.simpleauthv2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.asteises.simpleauthv2.model.dto.UserRegDto;
import ru.asteises.simpleauthv2.model.entity.Role;
import ru.asteises.simpleauthv2.model.entity.User;
import ru.asteises.simpleauthv2.repositories.UserStorage;

import javax.management.relation.RoleNotFoundException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserStorage userStorage;
    private final RoleService roleService;

    public void registration(UserRegDto userRegDto) throws RoleNotFoundException {
        User user = new User();
        user.setUsername(userRegDto.getUsername());
        Role role = roleService.getRoleByName(userRegDto.getRoleName());
        user.setRoles(Set.of(role));
        userStorage.save(user);
    }
}
