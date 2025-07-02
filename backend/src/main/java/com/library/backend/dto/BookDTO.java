package com.library.backend.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private Long bookId;
    private String bookTitle;
    private String isbn;
    private String author;
    private String publisher;
    private Integer publicationYear;
    private Date addedDate;
    private List<Long> genreIds;
    private List<Long> bookCopyIds;
    private List<Long> booksGenresIds;
}
