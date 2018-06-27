package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Driver;
import com.example.demo.model.Vehicle;
import com.example.demo.service.DriveService;
import com.example.demo.service.DriverService;
import com.example.demo.service.VehicleService;

/**
 * @author José Suen
 */
@Controller
public class WEBApiController {
	
	/*Autowired wires beans seamlessly*/
	
	@Autowired
	private DriveService driveservice;

	@Autowired
	private VehicleService vehicleservice;
	
	
	@Autowired
	private DriverService driverservice;
	
	//HOME VIEW
	
	@RequestMapping("/")
	public String home () {
		return "home";
	}
	@RequestMapping("/login")
	public String login () {
		return "login";
	}
	
	//DRIVE VIEWS
	@GetMapping("/vehicle/{vin}/drive/{driveid}")
    public String vehicledetails(Model model, @PathVariable (value = "vin") String vin, @PathVariable (value = "driveid") int driveid) {
		model.addAttribute("drive", driveservice.findById(driveid).get());
		model.addAttribute("readings", driveservice.findById(driveid).get().getObdreadings());
        return "drivedetails";
    }

	
	//VEHICLE VIEWS
	@RequestMapping(value = "/vehicle", method = RequestMethod.GET)
    public String newvehicle(Model model) {
		model.addAttribute("vehicle", new Vehicle());
		model.addAttribute("savedvehicles", vehicleservice.getAllVehicles());
        return "vehicles";
    }
	
	 @RequestMapping(value = "/vehicle", method = RequestMethod.POST) 
	  public String createnewvehicle(@ModelAttribute Vehicle vehicle) { 
	        vehicleservice.createNewVehicle(vehicle); 
	        return "redirect:/vehicle";
	  } 
	
	@RequestMapping(value = "/vehicle/{vin}", method = RequestMethod.GET)
    public String vehicledetails(Model model, @PathVariable (value = "vin") String vin) {
		model.addAttribute("vehicle", vehicleservice.findByVin(vin));
		model.addAttribute("drives", vehicleservice.getAllDrives(vin));
        return "vehicledetails";
    }
	
	//DRIVER VIEWS
	@RequestMapping(value = "/driver", method = RequestMethod.GET)
    public String newdriver(Model model) {
		model.addAttribute("driver", new Driver());
		model.addAttribute("saveddrivers", driverservice.getAllDrivers());
        return "driver";
    }
	
	@RequestMapping(value = "/driver", method = RequestMethod.POST)
	public String createnewdriver(@ModelAttribute Driver driver) {
        driverservice.createNewDriver(driver);
        return "redirect:/driver";
        
    }
}
