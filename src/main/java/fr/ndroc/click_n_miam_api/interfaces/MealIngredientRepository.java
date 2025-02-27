package fr.ndroc.click_n_miam_api.interfaces;

import fr.ndroc.click_n_miam_api.entities.MealIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealIngredientRepository extends JpaRepository<MealIngredient, Integer> {
}
