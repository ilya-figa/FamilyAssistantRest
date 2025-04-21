package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * @author Buyevich_IG
 */

@Entity
@Table(schema = "family_assistant_schema", name = "recipe_book")
@Getter
@Setter
@ToString
public class RecipeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id", nullable = false)
    public Long id;
    @Column(name = "recipe_name")
    public String name;
    @Column(name = "products_json")
    public String productsJson;
    @Column(name = "recipe")
    public String recipe;
}
