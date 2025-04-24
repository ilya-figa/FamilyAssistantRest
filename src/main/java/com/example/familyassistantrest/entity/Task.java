package com.example.familyassistantrest.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Buyevich_IG
 */

@Entity
@Table(schema = "family_assistant_schema", name = "tasks")
@Getter
@Setter
@ToString
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
    @Column(name = "date_from")
    public LocalDateTime dateFrom;
    @Column(name = "date_to")
    public LocalDateTime dateTo;
    @Column(name = "creator_user_id", nullable = false)
    public Long creatorUserId;
    @Column(name = "create_date")
    public LocalDate createDate;
    @Column(name = "description")
    public String description;
    @Column(name = "repetition_type_id", nullable = false)
    public Long repetitionTypeId;



}
