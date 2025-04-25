package com.example.familyassistantrest.controllers;

import com.example.familyassistantrest.entity.User;
import com.example.familyassistantrest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping()
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getById(@PathVariable Long id){
        return ResponseEntity.ok(userRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
        //TODO проверки
        return ResponseEntity.ok(userRepository.save(user));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        //TODO проверки
        userRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }
}
