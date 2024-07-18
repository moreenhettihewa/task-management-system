package com.tasks.managemo.controllers;

import com.tasks.managemo.model.Assigner;
import com.tasks.managemo.repository.AssignerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assigners")
public class AssignerController {

    @Autowired
    private AssignerRepository assignerRepository;

    @GetMapping
    public List<Assigner> getAll(){
        return assignerRepository.findAll();
    }

    @PostMapping
    public Assigner create( @RequestBody Assigner assigner){
        return assignerRepository.save(assigner);
    }

    @PutMapping("/{id}")
    public Assigner update(@PathVariable Long id, @RequestBody Assigner assigner){
        Assigner assignerToUpdate = assignerRepository.findById(id).get();
        assignerToUpdate.setFirstName(assigner.getFirstName());
        assignerToUpdate.setLastName(assigner.getLastName());
        assignerToUpdate.setEmail(assigner.getEmail());
        assignerToUpdate.setTasks(assigner.getTasks());
        return assignerRepository.save(assignerToUpdate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        assignerRepository.deleteById(id);
    }
}
