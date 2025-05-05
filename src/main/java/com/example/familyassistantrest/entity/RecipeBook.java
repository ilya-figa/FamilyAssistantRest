package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.ToString;
/**
 * @author Buyevich_IG
 */

@Entity
@Table(name = "recipe_book")
@ToString
public class RecipeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id", nullable = false)
    public Long id;
    @Column(name = "recipe_name")
    public String name;
    @Column(name = "products_xml")
    public String productsXml;
    @Column(name = "steps_xml")
    public String stepsXml;

    public RecipeBook() {}
    public RecipeBook(Long id, String name, String productsXml, String stepsXml) {
        this.id = id;
        this.name = name;
        this.productsXml = productsXml;
        this.stepsXml = stepsXml;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductsXml() {
        return productsXml;
    }

    public void setProductsXml(String productsXml) {
        this.productsXml = productsXml;
    }

    public String getStepsXml() {
        return stepsXml;
    }

    public void setStepsXml(String stepsXml) {
        this.stepsXml = stepsXml;
    }
}
