package com.example.familyassistantrest.repository;

import com.example.familyassistantrest.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {

}
