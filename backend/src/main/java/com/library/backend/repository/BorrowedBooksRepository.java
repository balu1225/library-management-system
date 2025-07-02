package com.library.backend.repository;

import com.library.backend.model.BorrowedBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowedBooksRepository extends JpaRepository<BorrowedBooks, Long> {
}
