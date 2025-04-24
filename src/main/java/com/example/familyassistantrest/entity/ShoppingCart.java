package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@Table(schema = "family_assistant_schema", name = "shopping_cart")
@ToString
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    public Long id;
    @Column(name = "product_name")
    public String name;
    @Column(name = "product_quantity")
    public String quantity;
    @Column(name = "units_measurement_id", nullable = false)
    public Long unitsMeasurementId;

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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Long getUnitsMeasurementId() {
        return unitsMeasurementId;
    }

    public void setUnitsMeasurementId(Long unitsMeasurementId) {
        this.unitsMeasurementId = unitsMeasurementId;
    }
}
