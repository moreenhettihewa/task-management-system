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
                       );
    }
}
