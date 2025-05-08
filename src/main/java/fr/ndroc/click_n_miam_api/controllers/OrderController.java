package fr.ndroc.click_n_miam_api.controllers;

import fr.ndroc.click_n_miam_api.entities.Order;
import fr.ndroc.click_n_miam_api.interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/by-email")
    public List<Order> getOrdersByEmail(String email) {
        return (List<Order>) orderRepository.findAllByEmail(email);
    }


    @PostMapping(value = "/send-order", consumes = MediaType.ALL_VALUE)
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {

        Order savedOrder = orderRepository.save(order);

        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
    }
}
