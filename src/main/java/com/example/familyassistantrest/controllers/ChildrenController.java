package com.example.familyassistantrest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/children")
public class ChildrenController {
    @GetMapping
    public ResponseEntity<?> getAnimal(){
        return ResponseEntity.ok("OK");
    }
}
