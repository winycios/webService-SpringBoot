package com.winy_group.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winy_group.demo.entities.Order;
import com.winy_group.demo.repositories.OrderRepository;

@Service
public class OrderServices {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findbyId(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }

}
