package com.library.backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book_copies")
public class BookCopies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_copy_id")
    private Long bookCopyId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Books book;
    @Column(nullable = false)
    private String status;
    @Column(name = "shelf_location", nullable = false)
    private String shelfLocation;

    @OneToMany(mappedBy = "bookCopy", cascade = CascadeType.ALL)
    private List<BorrowedBooks> borrowedBooks;

}
