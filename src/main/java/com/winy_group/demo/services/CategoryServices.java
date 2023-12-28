package com.winy_group.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winy_group.demo.entities.Category;
import com.winy_group.demo.repositories.CategoryRepository;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }

    public Category findbyId(Long id) {
        Optional<Category> Category = CategoryRepository.findById(id);
        return Category.get();
    }

}
