package org.example.authors.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorDTO {
    @NotEmpty
    private String url;

    @NotEmpty
    private String name;

    @NotEmpty
    private String bio;
}
