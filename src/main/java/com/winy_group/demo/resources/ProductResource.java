package com.winy_group.demo.resources;

import org.springframework.web.bind.annotation.RestController;

import com.winy_group.demo.entities.Product;
import com.winy_group.demo.services.ProductServices;

import jakarta.annotation.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/products")

@Resource
public class ProductResource {

    @Autowired
    private ProductServices services;

    // listar todos os produtos
    @GetMapping("all")
    public ResponseEntity<List<Product>> findAll() {
        List<Product> result = services.findAll();
        return ResponseEntity.ok().body(result);
    }

     // procurar um produto
    @GetMapping(value = "byId/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product result = services.findbyId(id);
        return ResponseEntity.ok().body(result);
    }
}
