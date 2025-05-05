package com.example.familyassistantrest.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Buyevich_IG
 */

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id", nullable = false)
    public Long id;
    @Column(name = "type_case_id", nullable = false)
    public Long typeCaseId;
    @Column(name = "executor_user_id", nullable = false)
    public Long executorUserId;
    @Column(name = "subject_user_id", nullable = false)
    public Long subjectUserId;
    @Column(name = "name_task")
    public String name;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "event_date")
    public LocalDateTime eventDate;
    @Column(name = "creator_user_id", nullable = false)
    public Long creatorUserId;
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "create_date")
    public LocalDate createDate;
    @Column(name = "description")
    public String description;
    @Column(name = "repetition_type_id", nullable = false)
    public Long repetitionTypeId;

    public Task(Long id, Long typeCaseId, Long executorUserId, Long subjectUserId, String name, LocalDateTime eventDate, Long creatorUserId, LocalDate createDate, String description, Long repetitionTypeId) {
        this.id = id;
        this.typeCaseId = typeCaseId;
        this.executorUserId = executorUserId;
        this.subjectUserId = subjectUserId;
        this.name = name;
        this.eventDate = eventDate;
        this.creatorUserId = creatorUserId;
        this.createDate = createDate;
        this.description = description;
        this.repetitionTypeId = repetitionTypeId;
    }

    public Task() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeCaseId() {
        return typeCaseId;
    }

    public void setTypeCaseId(Long typeCaseId) {
        this.typeCaseId = typeCaseId;
    }

    public Long getExecutorUserId() {
        return executorUserId;
    }

    public void setExecutorUserId(Long executorUserId) {
        this.executorUserId = executorUserId;
    }

    public Long getSubjectUserId() {
        return subjectUserId;
    }

    public void setSubjectUserId(Long subjectUserId) {
        this.subjectUserId = subjectUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public Long getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getRepetitionTypeId() {
        return repetitionTypeId;
    }

    public void setRepetitionTypeId(Long repetitionTypeId) {
        this.repetitionTypeId = repetitionTypeId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", typeCaseId=" + typeCaseId +
                ", executorUserId=" + executorUserId +
                ", subjectUserId=" + subjectUserId +
                ", name='" + name + '\'' +
                ", date=" + eventDate +
                ", creatorUserId=" + creatorUserId +
                ", createDate=" + createDate +
                ", description='" + description + '\'' +
                ", repetitionTypeId=" + repetitionTypeId +
                '}';
    }
}
