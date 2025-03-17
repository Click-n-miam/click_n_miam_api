package fr.ndroc.click_n_miam_api.interfaces;

import fr.ndroc.click_n_miam_api.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "options")
public interface OptionRepository extends JpaRepository<Option, Integer> {

//    @RestResource(path = "search-by-name" )
//    Iterable<Option> findByNameContaining(@Param("val") String name);
//
//    @RestResource(path = "search-by-name-or-age")
//    Iterable<Option> findByNameContainingOrPrice(@Param("n") String name, @Param("p") float price);
}
