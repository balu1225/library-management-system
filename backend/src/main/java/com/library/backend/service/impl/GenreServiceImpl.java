package com.library.backend.service.impl;

import com.library.backend.dto.GenreDTO;
import com.library.backend.mapper.GenreMapper;
import com.library.backend.model.Genres;
import com.library.backend.repository.GenresRepository;
import com.library.backend.service.GenreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    private final GenresRepository genreRepository;
    public GenreServiceImpl(GenresRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<GenreDTO> getAllGenres() {
        List<Genres> genres = genreRepository.findAll();
        return GenreMapper.toDtoList(genres);
    }

    public GenreDTO addGenre(GenreDTO genreDTO) {
        Genres genre = GenreMapper.toEntity(genreDTO);
        Genres saved = genreRepository.save(genre);
        return GenreMapper.toDto(saved);
    }
}
