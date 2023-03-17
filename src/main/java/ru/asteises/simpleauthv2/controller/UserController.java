package ru.asteises.simpleauthv2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.asteises.simpleauthv2.model.dto.UserRegDto;
import ru.asteises.simpleauthv2.service.UserService;

import javax.management.relation.RoleNotFoundException;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<String> registration(@RequestBody @Valid UserRegDto userRegDto) throws RoleNotFoundException {
        userService.registration(userRegDto);
        return ResponseEntity.ok("User create");
    }
}
