package com.edu.edu_planner.repository;

import com.edu.edu_planner.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
