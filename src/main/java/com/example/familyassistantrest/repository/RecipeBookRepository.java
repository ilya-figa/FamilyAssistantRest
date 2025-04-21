package com.example.familyassistantrest.repository;

import com.example.familyassistantrest.entity.RecipeBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeBookRepository extends JpaRepository<RecipeBook,Long> {

}
