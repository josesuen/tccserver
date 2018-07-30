package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonIgnore;

@DynamoDBTable(tableName = "Vehicle")
public class Vehicle {
	
	/*Attributes*/
	String vin;
	private String brand;
	private String model;
	private String color;
	private int year;
	private double power;
	private double torque;
	private double eng_size;
	private double odometer;
	

	/*Constructors */
	
	public Vehicle() {
		
	}
	
	/*Getters and setters*/
	@DynamoDBHashKey
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
    @DynamoDBAttribute
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
    @DynamoDBAttribute
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
    @DynamoDBAttribute
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
    @DynamoDBAttribute
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
    @DynamoDBAttribute
	public double getTorque() {
		return torque;
	}
	public void setTorque(double torque) {
		this.torque = torque;
	}
    @DynamoDBAttribute
	public double getEng_size() {
		return eng_size;
	}
	public void setEng_size(double eng_size) {
		this.eng_size = eng_size;
	}
	
    @DynamoDBAttribute
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
    @DynamoDBAttribute
	public double getOdometer() {
		return odometer;
	}

	public void setOdometer(double odometer) {
		this.odometer = odometer;
	}

}
