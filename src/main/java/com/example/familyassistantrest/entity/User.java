package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * @author Buyevich_IG
 */

@Entity
@Table(schema = "family_assistant_schema", name = "user")
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    public Long id;
    @Column(name = "role_id")
    public Long roleId;
    @Column(name = "user_name")
    public String name;
}
