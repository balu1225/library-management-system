package com.library.backend.repository;

import com.library.backend.model.BooksGenres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksGenresRepository extends JpaRepository<BooksGenres, Long> {
}
