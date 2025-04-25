package com.example.familyassistantrest.controllers.main;

import com.example.familyassistantrest.entity.ShoppingCart;
import com.example.familyassistantrest.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @GetMapping()
    public ResponseEntity<List<ShoppingCart>> getAll(){
        return ResponseEntity.ok(shoppingCartRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ShoppingCart>> getById(@PathVariable Long id){
        return ResponseEntity.ok(shoppingCartRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<ShoppingCart> create(@RequestBody ShoppingCart shoppingCart){
        //TODO проверки
        var save = shoppingCartRepository.save(shoppingCart);
        return ResponseEntity.ok(save);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        //TODO проверки
        shoppingCartRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }
}
