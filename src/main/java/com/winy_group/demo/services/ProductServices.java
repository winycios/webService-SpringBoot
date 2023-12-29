package com.winy_group.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winy_group.demo.entities.Product;
import com.winy_group.demo.repositories.ProductRepository;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository ProductRepository;

    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

    public Product findbyId(Long id) {
        Optional<Product> Product = ProductRepository.findById(id);
        return Product.get();
    }

}
