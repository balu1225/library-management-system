package com.library.backend.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BooksGenresId implements Serializable {
    private Long book;
    private Long genre;
}