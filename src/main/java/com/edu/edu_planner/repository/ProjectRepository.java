package com.edu.edu_planner.repository;

import com.edu.edu_planner.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
