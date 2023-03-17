package ru.asteises.simpleauthv2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.asteises.simpleauthv2.model.dto.RoleDto;
import ru.asteises.simpleauthv2.model.entity.Role;

import java.util.List;

@Mapper
public abstract class RoleMapper {

    public static final RoleMapper INSTANCE = Mappers.getMapper( RoleMapper.class);

    public abstract RoleDto map(Role role);
    public abstract List<RoleDto> map(List<Role> roles);
}
