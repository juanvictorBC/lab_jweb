package com.lptec.section22.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lptec.section22.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
