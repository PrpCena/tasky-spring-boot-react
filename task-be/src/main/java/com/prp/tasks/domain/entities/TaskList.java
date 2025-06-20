package com.prp.tasks.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="task_lists")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",  updatable = false , nullable = false)
    private UUID id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name="description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "taskList", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Task> tasks;

    @Column(name="created", nullable = false)
    private LocalDateTime created;

    @Column(name="updated", nullable = false)
    private LocalDateTime updated;

}
