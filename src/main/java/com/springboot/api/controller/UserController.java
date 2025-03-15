package com.springboot.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.model.GroceryItem;
import com.springboot.api.model.Order;
import com.springboot.api.repository.GroceryItemRepository;
import com.springboot.api.repository.OrderRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private GroceryItemRepository groceryRepository;

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/grocery")
    public List<GroceryItem> getAvailableItems() {
        return groceryRepository.findAll();
    }

    @PostMapping("/order")
    public Order placeOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }
}