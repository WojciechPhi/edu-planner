package com.edu.edu_planner.controller;

import com.edu.edu_planner.model.Task;
import com.edu.edu_planner.service.TaskService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private final TaskService taskService;

    public TaskController (TaskService taskService){this.taskService = taskService;}

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@PathVariable Task task){
        return taskService.createTask(task);
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
        return taskService.getTaskById(id);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails){
        return taskService.updateTask(id, taskDetails);
    }

    @DeleteMapping("/{id}")
    public Task deleteTask(@PathVariable Long id){
        return taskService.deleteTask(id);
    }
}
