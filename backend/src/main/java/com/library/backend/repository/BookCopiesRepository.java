package com.library.backend.repository;

import com.library.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCopiesRepository extends JpaRepository<User, Long> {

}
