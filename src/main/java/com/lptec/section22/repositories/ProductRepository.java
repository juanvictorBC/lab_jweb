package com.lptec.section22.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lptec.section22.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
