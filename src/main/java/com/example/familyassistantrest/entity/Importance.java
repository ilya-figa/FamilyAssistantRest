package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * @author Buyevich_IG
 */

@Entity
@Table(name = "importance")
@Getter
@Setter
@ToString
public class Importance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "importance_id", nullable = false)
    public Long id;
    @Column(name = "importance_name")
    public String name;

    public Importance() {}
    public Importance(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
