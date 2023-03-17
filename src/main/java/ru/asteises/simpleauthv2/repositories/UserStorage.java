package ru.asteises.simpleauthv2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.simpleauthv2.model.entity.User;

@Repository
public interface UserStorage extends JpaRepository<User, Long> {

}
