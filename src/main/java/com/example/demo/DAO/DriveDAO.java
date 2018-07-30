package com.example.demo.DAO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Drive;
import com.example.demo.model.Vehicle;

public interface DriveDAO extends CrudRepository <Drive, Integer> {


}
