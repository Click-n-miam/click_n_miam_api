package fr.ndroc.click_n_miam_api.controllers;

import fr.ndroc.click_n_miam_api.entities.Meal;
import fr.ndroc.click_n_miam_api.enums.MealType;
import fr.ndroc.click_n_miam_api.interfaces.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealController {

    @Autowired
    private MealRepository mealRepository;

    @GetMapping("/by-type")
    public List<Meal> getMealsByType(String type) {
        return (List<Meal>) mealRepository.findByType(MealType.valueOf(type));
    }

}
