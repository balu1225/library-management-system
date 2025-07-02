package com.library.backend.dto;

import lombok.*;

import java.util.List;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class BookCopyDTO {
    private Long bookCopyId;
    private Long bookId;
    private String status;
    private String shelfLocation;
    private List<Long> borrowedBookIds;
}
