package com.library.backend.mapper;

import com.library.backend.dto.BookDTO;
import com.library.backend.model.Books;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

    public static Books toEntity(BookDTO bookDto){
        Books books = new Books();

        books.setBookId(bookDto.getBookId());
        books.setBookTitle(bookDto.getBookTitle());
        books.setAuthor(bookDto.getAuthor());
        books.setPublisher(bookDto.getPublisher());
        books.setPublicationYear(bookDto.getPublicationYear());
        books.setIsbn(bookDto.getIsbn());
        books.setAddedDate(bookDto.getAddedDate() != null ? bookDto.getAddedDate() : new Date());
        return books;
    }

    public static BookDTO toDto(Books books){
        BookDTO bookDto = new BookDTO();
        bookDto.setBookId(books.getBookId());
        bookDto.setBookTitle(books.getBookTitle());
        bookDto.setAuthor(books.getAuthor());
        bookDto.setPublisher(books.getPublisher());
        bookDto.setPublicationYear(books.getPublicationYear());
        bookDto.setIsbn(books.getIsbn());
        bookDto.setAddedDate(books.getAddedDate());
        // Convert Set<BooksGenres> to List<Long> of genreIds
        if (books.getBooksGenres() != null) {
            List<Long> genreIds = books.getBooksGenres()
                    .stream()
                    .map(bg -> bg.getGenre().getGenreId())
                    .collect(Collectors.toList());
            bookDto.setGenreIds(genreIds);
        }

        // Optional: Add logic for bookCopyIds and booksGenresIds if needed
        bookDto.setBookCopyIds(null);       // Placeholder
        bookDto.setBooksGenresIds(null);    // Placeholder


        return bookDto;
    }

    public static List<BookDTO> toDtoList(List<Books> books) {
        return books.stream()
                .map(BookMapper::toDto)
                .collect(Collectors.toList());
    }
}
