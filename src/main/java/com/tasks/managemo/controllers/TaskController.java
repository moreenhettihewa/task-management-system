package com.tasks.managemo.controllers;

import com.tasks.managemo.model.Task;
import com.tasks.managemo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> getAll(){
       return taskRepository.findAll();
    }

    @PostMapping
    public Task create(@RequestBody Task task){
        return taskRepository.save(task);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task){
        Task taskToUpdate = taskRepository.findById(id).get();
        taskToUpdate.setTitle(task.getTitle());
        taskToUpdate.setDescription(task.getDescription());
        taskToUpdate.setDueDate(task.getDueDate());
        taskToUpdate.setAssigner(task.getAssigner());
        taskToUpdate.setProject(task.getProject());
        return taskRepository.save(taskToUpdate);
    }
}
