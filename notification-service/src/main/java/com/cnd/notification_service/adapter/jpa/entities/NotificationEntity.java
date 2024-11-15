package com.cnd.notification_service.adapter.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Table(name = "collections")
@NoArgsConstructor
@Entity
public class NotificationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private UserEntity author;
    private String description;
    @ManyToMany
    @JoinTable(
            name = "collection_recipes",
            joinColumns = @JoinColumn(name = "collection_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id")
    )
    private List<RecipeEntity> recipes;

    public void addRecipe(RecipeEntity recipe) {
        this.recipes.add(recipe);
    }

    public void removeRecipe(RecipeEntity recipe) {
        this.recipes.remove(recipe);
    }
}