package fr.ndroc.click_n_miam_api.interfaces;

import fr.ndroc.click_n_miam_api.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "list-ingredients", path = "ingredients")
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
