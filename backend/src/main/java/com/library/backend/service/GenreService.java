package com.library.backend.service;

import com.library.backend.dto.GenreDTO;

import java.util.List;

public interface GenreService {
    List<GenreDTO> getAllGenres();

    GenreDTO addGenre(GenreDTO genreDTO);
}
