package com.library.backend.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "borrowed_books")
public class BorrowedBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowed_book_id")
    private Long borrowedBookId;
    @JsonManagedReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id", nullable = false)
    private Transactions transaction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_copy_id", nullable = false)
    private BookCopies bookCopy;
    @Column(name = "borrowed_date", nullable = false, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date borrowedDate = new Date();
    @Column(name = "due_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    @Column(name = "return_date")
    @Temporal(TemporalType.DATE)
    private Date returnDate;
    @Column(name = "fine_amount")
    private Integer fineAmount;
    @Column(name = "fine_reason")
    private String fineReason ;
}
