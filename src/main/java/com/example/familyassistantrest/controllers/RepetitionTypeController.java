package com.example.familyassistantrest.controllers;

import com.example.familyassistantrest.entity.RepetitionType;
import com.example.familyassistantrest.repository.RepetitionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/repetitionType")
public class RepetitionTypeController {
    @Autowired
    RepetitionTypeRepository repetitionTypeRepository;

    @GetMapping()
    public ResponseEntity<List<RepetitionType>> getAll(){
        return ResponseEntity.ok(repetitionTypeRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<RepetitionType>> getById(@PathVariable Long id){
        return ResponseEntity.ok(repetitionTypeRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<RepetitionType> create(@RequestBody RepetitionType repetitionType){
        //TODO проверки
        var save = repetitionTypeRepository.save(repetitionType);
        return ResponseEntity.ok(save);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        //TODO проверки
        repetitionTypeRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }
}
