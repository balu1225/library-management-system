package com.library.backend.mapper;


import com.library.backend.dto.BookCopyDTO;
import com.library.backend.model.BookCopies;

public class BookCopyMapper {

    public static BookCopyDTO toDto(BookCopies bookCopies){
        BookCopyDTO bookCopyDTO = new BookCopyDTO();
        bookCopyDTO.setBookCopyId(bookCopies.getBookCopyId());

        return bookCopyDTO;
    }
}
