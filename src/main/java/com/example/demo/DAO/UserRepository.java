package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.authentication.User;


public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
}