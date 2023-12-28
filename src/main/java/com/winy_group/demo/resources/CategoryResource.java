package com.winy_group.demo.resources;

import org.springframework.web.bind.annotation.RestController;

import com.winy_group.demo.entities.Category;
import com.winy_group.demo.services.CategoryServices;

import jakarta.annotation.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/category")

@Resource
public class CategoryResource {

    @Autowired
    private CategoryServices services;

    // listar todos os pedidos
    @GetMapping("all")
    public ResponseEntity<List<Category>> findAll() {
        List<Category> result = services.findAll();
        return ResponseEntity.ok().body(result);
    }

     // procurar um pedido
    @GetMapping(value = "byId/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category result = services.findbyId(id);
        return ResponseEntity.ok().body(result);
    }
}
