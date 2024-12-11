package org.example.authors.controller;

import org.example.authors.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Validated
@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
}
