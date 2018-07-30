package com.example.demo.DAO;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OBDReading;

/*Implementa um repositorio - Data access object- Facilita os CRUDS extendendo o CrudRepository :) */
@EnableScan
public interface OBDReadingsDAO extends CrudRepository <OBDReading, Integer>  {
	


}