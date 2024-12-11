package org.example.authors.repository;

import org.example.authors.dto.AuthorDTO;
import org.example.authors.entity.Author;
import org.springframework.beans.BeanUtils;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

    Optional<Author> findByNameAndUrl(String name, String url);

}


