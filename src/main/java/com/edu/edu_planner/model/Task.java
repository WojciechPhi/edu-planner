package com.edu.edu_planner.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate dueDate;

    @ManyToOne
    @JoinColumn(name = "Project_id")
    private Project project;
}
