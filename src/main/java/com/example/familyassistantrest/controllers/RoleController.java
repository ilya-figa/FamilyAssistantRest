package com.example.familyassistantrest.controllers;

import com.example.familyassistantrest.entity.Role;
import com.example.familyassistantrest.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleRepository roleRepository;

    @GetMapping()
    public ResponseEntity<List<Role>> getAll(){
        return ResponseEntity.ok(roleRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Role>> getById(@PathVariable Long id){
        return ResponseEntity.ok(roleRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<Role> create(@RequestBody Role role){
        //TODO проверки
        var save = roleRepository.save(role);
        return ResponseEntity.ok(save);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        //TODO проверки
        roleRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }
}
