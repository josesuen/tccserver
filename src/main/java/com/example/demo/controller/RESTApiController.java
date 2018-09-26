package com.example.demo.controller;
import java.beans.PropertyEditorSupport;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Drive;
import com.example.demo.model.OBDReading;
import com.example.demo.model.Tank;
import com.example.demo.model.Vehicle;
import com.example.demo.service.DriveService;
import com.example.demo.service.DriverService;
import com.example.demo.service.OBDReadingService;
import com.example.demo.service.TankService;
import com.example.demo.service.VehicleService;

/**
 * @author José Suen
 */

@RestController


public class RESTApiController {
	/*Autowired wires beans seamlessly*/
	
	@Autowired
	private DriveService driveservice;

	@Autowired
	private VehicleService vehicleservice;
	
	@Autowired
	private OBDReadingService obdreadingservice;
	
	@Autowired
	private DriverService driverservice;
	@Autowired
	private TankService tankservice;
	
	@InitBinder("obdreading")
	protected void initBinder(WebDataBinder binder) {
	    binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
	        public void setAsText(String value) {
	             setValue(new Date(Long.valueOf(value)));
	        }

	    });
	}
	
	//VEHICLE OPERATIONS
	@RequestMapping(value = "/api/vehicle", method = RequestMethod.GET)
	@ResponseBody
    public List<Vehicle> returnAllVehicles() {
        return vehicleservice.getAllVehicles();
    }
	
	//DRIVE OPERATIONS
	@PostMapping("/api/vehicle/{vin}/drive")
    public Drive createdrive(@PathVariable (value = "vin") String vin, @Valid @RequestBody Drive drive) {
		drive.setVehicle(vehicleservice.findByVin(vin));
		Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
		drive.setDate(date);
		driveservice.createNewDrive(drive);
		return drive;
		
	}
	
	//TANK OPERATIONS
	@PostMapping("/api/vehicle/{vin}/tank")
    public Tank createTank(@PathVariable (value = "vin") String vin, @Valid @RequestBody Tank tank) {
		tank.setVehicle(vehicleservice.findByVin(vin));
		Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
		tank.setDate(date);
		tankservice.createNewTank(tank);
		return tank;
		
	}
	
	//OBDREADING OPERATIONS
	@PostMapping("/api/drive/{driveid}/obdreading")
    public void createreading(@PathVariable (value = "driveid") int driveid, @Valid @RequestBody OBDReading reading) {
		Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
	    reading.setTimestamp(date);
		reading.setDrive(driveservice.findById(driveid).get());
		obdreadingservice.createNewReading(reading);
	}
	


}
