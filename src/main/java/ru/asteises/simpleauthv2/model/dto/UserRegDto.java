package ru.asteises.simpleauthv2.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegDto {

    @Size(min = 2, max = 100, message = "username must be from 2 to 100 characters")
    private String username;

    private String roleName;
}
