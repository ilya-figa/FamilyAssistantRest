package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(schema = "family_assistant_schema", name = "animal")
@Getter
@Setter
@ToString
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "type")
    public String type;
}