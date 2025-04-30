package com.example.familyassistantrest.repository;

import com.example.familyassistantrest.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {

    List<Task> findAllByExecutorUserIdAndEventDateBetween(Long executorUserId, LocalDateTime fromEventDateTime, LocalDateTime toEventDateTime);
    List<Task> findAllBySubjectUserIdAndEventDateBetween(Long subjectUserId, LocalDateTime fromEventDateTime, LocalDateTime toEventDateTime);
    List<Task> findAllByCreatorUserIdAndEventDateBetween(Long creatorUserId, LocalDateTime fromEventDateTime, LocalDateTime toEventDateTime);
    List<Task> findAllByEventDateBetween(LocalDateTime fromEventDateTime, LocalDateTime toEventDateTime);
}
