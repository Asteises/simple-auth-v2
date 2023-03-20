package ru.asteises.simpleauthv2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.asteises.simpleauthv2.model.dto.RoleDto;
import ru.asteises.simpleauthv2.model.entity.Role;

import java.util.List;

@Mapper
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper( RoleMapper.class);

    RoleDto map(Role role);
    List<RoleDto> map(List<Role> roles);
}
