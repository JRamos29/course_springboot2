package com.jrammos29.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrammos29.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
