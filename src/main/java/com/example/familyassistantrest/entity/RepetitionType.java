package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Buyevich_IG
 */

@Entity
@Table(schema = "family_assistant_schema", name = "repetitions_type")
@Getter
@Setter
@ToString
public class RepetitionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "repetition_type_id", nullable = false)
    public Long id;
    @Column(name = "repetition_type")
    public String type;
}
