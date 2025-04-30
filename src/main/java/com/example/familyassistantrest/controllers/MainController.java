package com.example.familyassistantrest.controllers;

import com.example.familyassistantrest.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Buyevich_IG
 */
@RestController
@RequestMapping("/")
public class MainController {
    @Autowired
    public ImportanceRepository importanceRepository;
    @Autowired
    public RecipeBookRepository recipeBookRepository;
    @Autowired
    public RepetitionTypeRepository repetitionTypeRepository;
    @Autowired
    public RoleRepository roleRepository;
    @Autowired
    public ShoppingCartRepository shoppingCartRepository;
    @Autowired
    public TaskRepository taskRepository;
    @Autowired
    public TypeCaseRepository typeCaseRepository;
    @Autowired
    public UnitsMeasurementRepository unitsMeasurementRepository;
    @Autowired
    public UserRepository userRepository;
}
