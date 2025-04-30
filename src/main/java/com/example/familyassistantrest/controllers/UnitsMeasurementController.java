package com.example.familyassistantrest.controllers;

import com.example.familyassistantrest.entity.UnitsMeasurement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/unitsMeasurement")
public class UnitsMeasurementController extends MainController{
    @GetMapping()
    public ResponseEntity<List<UnitsMeasurement>> getAll(){
        return ResponseEntity.ok(unitsMeasurementRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UnitsMeasurement>> getById(@PathVariable Long id){
        return ResponseEntity.ok(unitsMeasurementRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<UnitsMeasurement> create(@RequestBody UnitsMeasurement unitsMeasurement){
        //TODO проверки
        var save = unitsMeasurementRepository.save(unitsMeasurement);
        return ResponseEntity.ok(save);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        //TODO проверки
        unitsMeasurementRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }
}
