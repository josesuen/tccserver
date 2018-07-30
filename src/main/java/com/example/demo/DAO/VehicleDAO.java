package com.example.demo.DAO;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Vehicle;

/*Implementa um repositorio - Data access object- Facilita os CRUDS extendendo o CrudRepository :) */
@EnableScan
public interface VehicleDAO extends JpaRepository <Vehicle, Integer>  {
	
	
    @Query("SELECT v FROM Vehicle v WHERE LOWER(v.vin) = LOWER(:vin)")
	public Vehicle findByVin (@Param("vin") String vin) ;

}