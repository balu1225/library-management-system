package com.library.backend.service.impl;

import com.library.backend.dto.BookDTO;
import com.library.backend.mapper.BookMapper;
import com.library.backend.model.Books;
import com.library.backend.repository.BooksRepository;
import com.library.backend.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    public final BooksRepository booksRepository;
    public BookServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public BookDTO addBook(BookDTO bookDTO) {
        // Logic to add a book using booksRepository
        Books book = BookMapper.toEntity(bookDTO);
        Books saved = booksRepository.save(book);
        return BookMapper.toDto(saved);
    }

    public List<BookDTO> getAllBooks() {
        // Logic to retrieve all books using booksRepository
        List<Books> books = booksRepository.findAll();
        return BookMapper.toDtoList(books);
    }
}
