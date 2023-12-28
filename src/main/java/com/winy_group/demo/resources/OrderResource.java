package com.winy_group.demo.resources;

import org.springframework.web.bind.annotation.RestController;

import com.winy_group.demo.entities.Order;
import com.winy_group.demo.services.OrderServices;

import jakarta.annotation.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/orders")

@Resource
public class OrderResource {

    @Autowired
    private OrderServices services;

    // listar todos os pedidos
    @GetMapping("all")
    public ResponseEntity<List<Order>> findAll() {
        List<Order> result = services.findAll();
        return ResponseEntity.ok().body(result);
    }

     // procurar um pedido
    @GetMapping(value = "byId/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order result = services.findbyId(id);
        return ResponseEntity.ok().body(result);
    }

       // procurar pedidos de um cliente

}
