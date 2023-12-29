package com.winy_group.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winy_group.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
