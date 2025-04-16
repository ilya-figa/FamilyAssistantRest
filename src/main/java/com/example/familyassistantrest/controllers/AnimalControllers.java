package com.example.familyassistantrest.controllers;

import com.example.familyassistantrest.entity.Animal;
import com.example.familyassistantrest.entity.Importance;
import com.example.familyassistantrest.repository.AnimalRepository;
import com.example.familyassistantrest.repository.ImportanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/animal")
public class AnimalControllers {

    @Autowired
    private AnimalRepository animalRepository;

    @GetMapping
    public ResponseEntity<?> getAnimal(){
        return ResponseEntity.ok("OK");
    }

    @PostMapping
    public ResponseEntity<Animal> add(@RequestBody Animal animal){
        var save = animalRepository.save(animal);
        return ResponseEntity.ok(save);
    }
}
