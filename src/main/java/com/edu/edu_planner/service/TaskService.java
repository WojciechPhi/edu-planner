package com.edu.edu_planner.service;

import com.edu.edu_planner.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks();

    Task createTask(Task task);

    Task getTaskById(Long id);

    Task updateTask(Long id, Task taskDetails);

    Task deleteTask(Long id);
}
