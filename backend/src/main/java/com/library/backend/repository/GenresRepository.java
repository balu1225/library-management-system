package com.library.backend.repository;

import com.library.backend.model.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenresRepository extends JpaRepository<Genres, Long> {
    // Additional query methods can be defined here if needed
}
