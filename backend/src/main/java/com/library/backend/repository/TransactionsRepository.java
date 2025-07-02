package com.library.backend.repository;

import com.library.backend.model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transactions, Long> {
    // Additional query methods can be defined here if needed
}
