package com.example.familyassistantrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class TypeCase {
    @Id
    public Long id;
    public Long idImportance;
    public String type;
}
