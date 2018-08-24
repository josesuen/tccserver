package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Drive {

	@Id
	@GeneratedValue
	private Integer id;
	

	private Date date;
	private String description;
	private double mileage_start;
	private double mileage_end;
	
	@ManyToOne
    @JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;
	
	@ManyToOne
    @JoinColumn(name = "driver_id")
	private Driver driver;
	
	@OneToMany(mappedBy = "drive", cascade = CascadeType.ALL)
	private List<OBDReading> obdreadings = new ArrayList<OBDReading>();	
	
	/*Generic constructor*/
	public Drive() {
    }
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getMileage_start() {
		return mileage_start;
	}

	public void setMileage_start(double mileage_start) {
		this.mileage_start = mileage_start;
	}
	
	public double getMileage_end() {
		return mileage_end;
	}

	public void setMileage_end(double mileage_end) {
		this.mileage_end = mileage_end;
	}
	
	
	public List<OBDReading> getObdreadings() {
		return obdreadings;
	}

	public void setObdreadings(List<OBDReading> obdreadings) {
		this.obdreadings = obdreadings;
	}

	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
