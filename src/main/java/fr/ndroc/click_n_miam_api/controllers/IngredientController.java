package fr.ndroc.click_n_miam_api.controllers;

import fr.ndroc.click_n_miam_api.entities.Ingredient;
import fr.ndroc.click_n_miam_api.interfaces.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping
    public List<Ingredient> getIngredients() {
        return (List<Ingredient>) ingredientRepository.findAll();
    }

    @PostMapping
    public Ingredient addIngredient(@RequestBody Ingredient ingredient) { return ingredientRepository.save(ingredient); }

}
