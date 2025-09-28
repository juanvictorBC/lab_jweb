package com.lptec.section22.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lptec.section22.entities.OrderItem;
import com.lptec.section22.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
