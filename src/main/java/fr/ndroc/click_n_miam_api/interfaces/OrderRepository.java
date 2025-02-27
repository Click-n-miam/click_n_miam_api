package fr.ndroc.click_n_miam_api.interfaces;

import fr.ndroc.click_n_miam_api.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "list-orders", path = "orders" )
public interface OrderRepository extends JpaRepository<Order, Integer> {
    List<Order> findAllByEmail(String email);
}
