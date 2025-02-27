package fr.ndroc.click_n_miam_api.controllers;

import fr.ndroc.click_n_miam_api.entities.Order;
import fr.ndroc.click_n_miam_api.interfaces.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> getOrders() {
        return (List<Order>) orderRepository.findAll();
    }

    @GetMapping("/by-email")
    public List<Order> getOrdersByEmail(String email) {
        return (List<Order>) orderRepository.findAllByEmail(email);
    }

}
