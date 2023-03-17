package ru.asteises.simpleauthv2.model.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleRegDto {

    @NotEmpty
    private String name;
}
