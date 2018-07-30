package com.example.demo.DAO;


import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.authentication.Role;

@EnableScan
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByRole(String role);

}