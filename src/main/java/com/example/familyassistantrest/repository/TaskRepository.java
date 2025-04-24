package com.example.familyassistantrest.repository;

import com.example.familyassistantrest.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
