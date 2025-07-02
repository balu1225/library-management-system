package com.library.backend.dto;

import lombok.*;

import java.sql.Date;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class BorrowedBookDTO {
    private Long borrowedBookId;
    private Long transactionId;
    private Long bookCopyId;
    private Date borrowedDate;
    private Date dueDate;
    private Date returnDate;
    private Integer fineAmount;
    private String fineReason;
}
