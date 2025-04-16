package com.example.familyassistantrest.repository;

import com.example.familyassistantrest.entity.Animal;
import com.example.familyassistantrest.entity.Importance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal,Long> {

}
