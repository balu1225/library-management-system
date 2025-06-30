package com.library.backend.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books_genres")
public class BooksGenres {

    @EmbeddedId
    private BooksGenresId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("book")
    @JoinColumn(name = "book_id", nullable = false)
    private Books book;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("genre")
    @JoinColumn(name = "genre_id", nullable = false)
    private Genres genre;
}
