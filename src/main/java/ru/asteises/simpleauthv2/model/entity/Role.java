package ru.asteises.simpleauthv2.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
    public Role() {
    }
}
