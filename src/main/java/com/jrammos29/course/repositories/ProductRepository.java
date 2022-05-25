package com.jrammos29.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrammos29.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
