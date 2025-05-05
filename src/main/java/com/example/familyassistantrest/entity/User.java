package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
/**
 * @author Buyevich_IG
 */

@Entity
@Table(schema = "family_assistant_schema", name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    public Long id;
    @Column(name = "role_id", nullable = false)
    public Long roleId;
    @Column(name = "user_name")
    public String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
