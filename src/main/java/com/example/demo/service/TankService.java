package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.TankDAO;
import com.example.demo.model.Drive;
import com.example.demo.model.Tank;

@Service
public class TankService {
	
	/*This annotation allows Spring to resolve and inject collaborating beans into your bean.*/
	@Autowired
	private TankDAO tankdao;

	/*Add drive*/
	public void createNewTank (Tank tank) {
		this.tankdao.save(tank);
	}
	
	public Optional<Tank> findById(int tankid) {
		return tankdao.findById(tankid);
	}
}
