package org.example.hsjboardproject.controller.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(@Param("username") String username);

    User findByEmail(@Param("email") String email);
}
