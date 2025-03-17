package fr.ndroc.click_n_miam_api.controllers;

import fr.ndroc.click_n_miam_api.entities.Order;
import fr.ndroc.click_n_miam_api.interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/")
    public List<Order> getOrders() {

        return orderRepository.findAll();
    }

//    @GetMapping("/by-email")
//    public List<Order> getOrdersByEmail(String email) {
//        return (List<Order>) orderRepository.findAllByEmail(email);
//    }

    @GetMapping("/by-email")
    public ResponseEntity<List<Order>> getOrdersByEmail(@RequestParam String email) {
        List<Order> orders = orderRepository.findAllByEmail(email);
        if (orders.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(orders);
    }

}
