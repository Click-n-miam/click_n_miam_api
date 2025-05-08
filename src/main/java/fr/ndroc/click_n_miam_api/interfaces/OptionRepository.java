package fr.ndroc.click_n_miam_api.interfaces;

import fr.ndroc.click_n_miam_api.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer> {

}
