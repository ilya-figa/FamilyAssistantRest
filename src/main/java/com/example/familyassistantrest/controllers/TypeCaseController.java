package com.example.familyassistantrest.controllers;

import com.example.familyassistantrest.entity.TypeCase;
import com.example.familyassistantrest.repository.TypeCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/typeCase")
public class TypeCaseController {
    @Autowired
    TypeCaseRepository typeCaseRepository;

    @GetMapping()
    public ResponseEntity<List<TypeCase>> getAll(){
        return ResponseEntity.ok(typeCaseRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<TypeCase>> getById(@PathVariable Long id){
        return ResponseEntity.ok(typeCaseRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<TypeCase> create(@RequestBody TypeCase typeCase){
        //TODO проверки
        var save = typeCaseRepository.save(typeCase);
        return ResponseEntity.ok(save);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        //TODO проверки
        typeCaseRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }
}
