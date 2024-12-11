package org.example.authors.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bpb_author", uniqueConstraints = @UniqueConstraint(columnNames = { "Name", "url" }))

@Getter
@Setter

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String name;
    private String url;
    private String bio;


}
