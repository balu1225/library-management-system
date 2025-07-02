package com.library.backend.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenreDTO {
    private Long genreId;
    private String genreName;
    private List<Long> bookIds = new ArrayList<>();
    private List<Long> booksGenresIds = new ArrayList<>();
}