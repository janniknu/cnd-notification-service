package com.cnd.collection_service.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    private String description;

    @ManyToMany
    @JoinTable(
            name = "collection_recipes",
            joinColumns = @JoinColumn(name = "collection_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id")
    )
    private List<Recipe> recipes;
}