package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Tank;

public interface TankDAO extends CrudRepository <Tank, Integer> {


}
