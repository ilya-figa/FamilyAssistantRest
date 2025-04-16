package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(schema = "family_assistant_schema")
@Getter
@Setter
@ToString
public class Importance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String type;
}
