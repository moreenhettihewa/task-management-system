package com.tasks.managemo.controllers;

import com.tasks.managemo.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getAll(){
        return List.of(
                new Task(1, "Create a task", "Create a task in the system", false),
                new Task(2, "Read a task", "Read a task from the system", false),
                new Task(3, "Update a task", "Update a task in the system", false),
                new Task(4, "Delete a task", "Delete a task from the system", false)
        );
    }
}
