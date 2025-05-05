package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * @author Buyevich_IG
 */

@Entity
@Table(name = "role")
@Getter
@Setter
@ToString
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false)
    public Long id;
    @Column(name = "role_type")
    public String roleType;

    public Role() {
    }
    public Role(Long id, String roleType) {
        this.id = id;
        this.roleType = roleType;
    }
}
