package com.library.backend.service;

import com.library.backend.dto.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO addBook(BookDTO bookDTO);

    List<BookDTO> getAllBooks();
}
