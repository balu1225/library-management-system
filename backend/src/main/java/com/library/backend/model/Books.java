package com.library.backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "book_title", nullable = false)
    private String bookTitle;

    @Column(unique = true, nullable = false)
    private String isbn;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String publisher;

    @Column(name = "publication_year", nullable = false)
    private Integer publicationYear;

    @Column(name = "added_date", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate = new Date();

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<BooksGenres> booksGenres;
}