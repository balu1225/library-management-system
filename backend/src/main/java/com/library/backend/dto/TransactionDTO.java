package com.library.backend.dto;

import lombok.*;

import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class TransactionDTO {
    private Long transactionId;
    private Long userId;
    private Date transactionDate;
    private List<Long> borrowedBookIds;
}
