package com.example.familyassistantrest.repository;

import com.example.familyassistantrest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllByRoleId(Long roleId);
}
