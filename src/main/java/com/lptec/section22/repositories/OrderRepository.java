package com.lptec.section22.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lptec.section22.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
