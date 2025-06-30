package com.library.backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "genres")
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    private Long genreId;
    @Column(name = "genre_name", nullable = false, unique = true)
    private String genreName;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    private Set<BooksGenres> booksGenres;
}
