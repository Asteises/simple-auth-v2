package ru.asteises.simpleauthv2.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
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
