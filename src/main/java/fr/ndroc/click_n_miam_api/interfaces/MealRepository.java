package fr.ndroc.click_n_miam_api.interfaces;

import fr.ndroc.click_n_miam_api.entities.Meal;
import fr.ndroc.click_n_miam_api.enums.MealType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepository extends JpaRepository<Meal, Integer> {
    List<Meal> findByType(MealType type);
}
