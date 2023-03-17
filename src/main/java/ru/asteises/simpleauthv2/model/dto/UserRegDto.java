package ru.asteises.simpleauthv2.model.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegDto {

    @Size(min = 2, max = 100, message = "username must be from 2 to 100 characters")
    private String username;

    private String roleName;
}
