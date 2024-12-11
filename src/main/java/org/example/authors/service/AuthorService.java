package org.example.authors.service;

import lombok.extern.slf4j.Slf4j;
import org.example.authors.dto.AuthorDTO;
import org.example.authors.entity.Author;
import org.example.authors.repository.AuthorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public boolean add(AuthorDTO authorDTO){
        Author author = new Author();

        BeanUtils.copyProperties(authorDTO,author);
        try{
            authorRepository.save(author);
            log.info("Author successfully saved: {}", authorDTO);
        }
        catch (DataAccessException dae){
            log.error("Error while saving Author: {}; Error: {}", authorDTO, dae.getMessage());
        }
        return true;
    }
}
