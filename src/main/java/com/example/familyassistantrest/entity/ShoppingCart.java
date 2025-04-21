package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(schema = "family_assistant_schema", name = "shopping_cart")
@Getter
@Setter
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
    @Column(name = "units_measurement_id")
    public Long unitsMeasurementId;
}
