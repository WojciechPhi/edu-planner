package com.edu.edu_planner.service;

import com.edu.edu_planner.model.Project;

import java.util.List;

public interface ProjectService {

    List<Project> getAllProjects();

    Project createProject(Project project);

    Project getProjectId(Long id);

    Project updateProject(Long id, Project projectDetails);

    Project deleteProject(Long id);
}
