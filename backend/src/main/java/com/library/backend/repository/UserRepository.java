package com.library.backend.repository;

import com.library.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // Additional query methods can be defined here if needed
}
