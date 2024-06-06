package com.edu.edu_planner.controller;

import com.edu.edu_planner.model.Project;
import com.edu.edu_planner.service.ProjectService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/api/projects")
public class ProjectController {

    @Autowired
    private final ProjectService projectService;


    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }

    @PostMapping
    public Project createProject(@PathVariable Project project){
        return projectService.createProject(project);
    }

    @GetMapping("/{id}")
    public Project getProjectId(@PathVariable Long id){
        return projectService.getProjectId(id);
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable Long id, @RequestBody Project projectDetails){
        return projectService.updateProject(id, projectDetails);
    }

    @DeleteMapping("/{id}")
    public Project deleteProject(@PathVariable Long id){
        return projectService.deleteProject(id);
    }

}
