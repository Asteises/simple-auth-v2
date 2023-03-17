package ru.asteises.simpleauthv2.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 2, max = 100, message = "username must be from 2 to 100 characters")
    private String username;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;
}
