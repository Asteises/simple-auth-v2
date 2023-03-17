package ru.asteises.simpleauthv2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.asteises.simpleauthv2.model.dto.RoleDto;
import ru.asteises.simpleauthv2.model.dto.RoleRegDto;
import ru.asteises.simpleauthv2.service.RoleService;

import javax.management.relation.RoleNotFoundException;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @PostMapping("/add")
    public ResponseEntity<String> addNewRole(@RequestBody @Valid RoleRegDto roleRegDto) {
        roleService.addNewRole(roleRegDto);
        return ResponseEntity.ok("New role create");
    }

    @GetMapping("/{roleId}")
    public ResponseEntity<RoleDto> getRoleById(@PathVariable Long roleId) throws RoleNotFoundException {
        return ResponseEntity.ok(roleService.getRoleById(roleId));
    }

    @GetMapping("/all")
    public ResponseEntity<Object> getAllRoles() {
        return new  ResponseEntity(roleService.getAllRoles(), HttpStatus.OK);
    }
}
