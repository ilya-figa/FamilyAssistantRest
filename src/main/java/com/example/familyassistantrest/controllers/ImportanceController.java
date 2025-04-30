package com.example.familyassistantrest.controllers;

import com.example.familyassistantrest.entity.Importance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/importance")
public class ImportanceController extends MainController{
    @GetMapping()
    public ResponseEntity<List<Importance>> getAll(){
        return ResponseEntity.ok(importanceRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Importance>> getById(@PathVariable Long id){
        return ResponseEntity.ok(importanceRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<Importance> create(@RequestBody Importance importance){
        //TODO проверки
        return ResponseEntity.ok(importanceRepository.save(importance));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        //TODO проверки
        importanceRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }
}
