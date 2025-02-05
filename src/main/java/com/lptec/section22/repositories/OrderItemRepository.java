package com.lptec.section22.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lptec.section22.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
