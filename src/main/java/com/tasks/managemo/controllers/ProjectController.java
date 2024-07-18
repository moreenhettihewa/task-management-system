package com.tasks.managemo.controllers;

import com.tasks.managemo.model.Project;
import com.tasks.managemo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping
    public List<Project> getAll() {
        return projectRepository.findAll();
    }

   @PostMapping
    public Project create(@RequestBody Project project) {
        return projectRepository.save(project);
    }

    @PutMapping("/{id}")
    public Project update(@PathVariable Long id, @RequestBody Project project) {
        Project projectToUpdate = projectRepository.findById(id).get();
        projectToUpdate.setName(project.getName());
        projectToUpdate.setDescription(project.getDescription());
        return projectRepository.save(projectToUpdate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        projectRepository.deleteById(id);
    }
}
