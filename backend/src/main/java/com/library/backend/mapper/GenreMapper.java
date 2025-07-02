package com.library.backend.mapper;

import com.library.backend.dto.GenreDTO;
import com.library.backend.model.Genres;

import java.util.List;

public class GenreMapper {

    public static GenreDTO toDto(Genres genre) {
        GenreDTO genreDTO = new GenreDTO();
        genreDTO.setGenreId(genre.getGenreId());
        genreDTO.setGenreName(genre.getGenreName());
        return genreDTO;
    }
    public static Genres toEntity(GenreDTO genreDTO) {
        Genres genre = new Genres();
        genre.setGenreName(genreDTO.getGenreName());
        return genre;
    }


    public static List<GenreDTO> toDtoList(List<Genres> genres) {
        return genres.stream()
                .map(GenreMapper::toDto)
                .toList();
    }
}

