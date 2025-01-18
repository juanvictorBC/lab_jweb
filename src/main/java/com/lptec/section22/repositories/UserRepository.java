package com.lptec.section22.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lptec.section22.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
