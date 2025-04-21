package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(schema = "family_assistant_schema", name = "type_case")
@Getter
@Setter
@ToString
public class TypeCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_case_id", nullable = false)
    public Long id;
    @Column(name = "importance_id")
    public Long importanceId;
    @Column(name = "type_case_name")
    public String name;
}
