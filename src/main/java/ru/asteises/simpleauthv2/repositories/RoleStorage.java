package ru.asteises.simpleauthv2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.simpleauthv2.model.entity.Role;

import java.util.Optional;

@Repository
public interface RoleStorage extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);
}
