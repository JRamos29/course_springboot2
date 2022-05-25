package com.jrammos29.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrammos29.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
