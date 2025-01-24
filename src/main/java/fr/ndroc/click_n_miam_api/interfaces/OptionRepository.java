package fr.ndroc.click_n_miam.interfaces;

import fr.ndroc.click_n_miam_api.entities.Option;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "list-options")
public interface OptionRepository extends CrudRepository<Option, Integer> {

    @RestResource(path = "search-by-name" )
    Iterable<Option> findByNameContaining(@Param("val") String name);

    @RestResource(path = "search-by-name-or-age")
    Iterable<Option> findByNameContainingOrPrice(@Param("n") String name, @Param("p") float price);
}
