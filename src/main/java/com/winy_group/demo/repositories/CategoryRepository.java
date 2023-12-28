package com.winy_group.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winy_group.demo.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


}
