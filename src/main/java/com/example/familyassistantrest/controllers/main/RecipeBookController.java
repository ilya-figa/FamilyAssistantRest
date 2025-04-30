package com.example.familyassistantrest.controllers.main;

import com.example.familyassistantrest.controllers.MainController;
import com.example.familyassistantrest.entity.RecipeBook;
import com.example.familyassistantrest.utils.ParseXml;
import com.example.familyassistantrest.utils.Util;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.JAXBException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

/**
 * @author Buyevich_I
 */
@RestController
@RequestMapping("/recipeBook")
public class RecipeBookController extends MainController {
    @GetMapping()
    public ResponseEntity<List<RecipeBook>> getAll(){
        //TODO распарсить xml
        return ResponseEntity.ok(recipeBookRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<RecipeBook>> getById(@PathVariable Long id){
        //TODO распарсить xml
        return ResponseEntity.ok(recipeBookRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<RecipeBook> create(@RequestBody RecipeBook recipe){
        //TODO проверки
        var save = recipeBookRepository.save(recipe);
        return ResponseEntity.ok(save);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        //TODO проверки
        recipeBookRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }

    @PostMapping("/addProductsToCart/{id}")
    public ResponseEntity<?> addProductsToCart(@PathVariable Long id) throws JAXBException, UnsupportedEncodingException {
        var recipe = recipeBookRepository.findById(id);
        if(recipe.isPresent()){
            ParseXml.getRecipeXml(recipe.get().getProductsXml()).getProductList().forEach(product->shoppingCartRepository.save(Util.getShoppingCart(product)));
        }else {
            return ResponseEntity.status(400).body("Нет рецепта с таким id");
        }
        return ResponseEntity.ok("add to cart");
    }
}
