package com.example.demo.model;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonMappingException;

/*Anotaçao entity traz a ideia de "BD". Cada atributo da classe vira uma coluna*/
@Entity
public class OBDReading implements Serializable {
	
	
	/*Id eh a chave primaria*/
	@Id
	@GeneratedValue
	int id; 
	
	
    double latitude, longitude;
    long timestamp;
    
    //Control
    private double TIMING_ADVANCE;
    private double EQUIV_RATIO;
    
    //Engine
    private double RPM;
	private double THROTTLE_POS;
	private double ENGINE_LOAD;
	private double ENGINE_RUNTIME;
	
	
	//Fuel
	private double MAF;
	private double FUEL_TYPE;
	private double FUEL_CONSUMPTION_RATE;
	private double ETHANOL_PERCENTAGE;
	private double FUEL_LEVEL;
	private double SHORT_TERM_FUEL_TRIM_1;
	private double LONG_TERM_FUEL_TRIM_1;
	private double SHORT_TERM_FUEL_TRIM_2;
	private double LONG_TERM_FUEL_TRIM_2;
	private double AIR_FUEL_RATIO;
	private double WIDEBAND_AIR_FUEL_RATIO;
	
	
	//Driver
	private double REL_THROTTLE_POS;
	//Temperatura
	private Integer ENGINE_COOLANT_TEMP;
	private double AMBIENT_AIR_TEMP;
	
	//Misc
	private Integer SPEED;
    
	
	
	
	//private double RELATIVE_ACCELERATOR_POSITION;
	
	//private double ENGINE_FUEL_RATE;
    
    @ManyToOne
    @JoinColumn(name = "drive_id")
    private Drive drive;
    
    /*generic construtor*/
    public OBDReading() {
    }
    
    /*Getters e Setters*/
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
	public Drive getDrive() {
		return drive;
	}

	public void setDrive(Drive drive) {
		this.drive = drive;
	}


	

	
    public double getENGINE_LOAD() {
		return ENGINE_LOAD;
	}

	public void setENGINE_LOAD(String ENGINE_LOAD) {
		ENGINE_LOAD = ENGINE_LOAD;
	}

	public Integer getENGINE_COOLANT_TEMP() {
		return ENGINE_COOLANT_TEMP;
	}

	public void setENGINE_COOLANT_TEMP(Integer ENGINE_COOLANT_TEMP) {
		ENGINE_COOLANT_TEMP = ENGINE_COOLANT_TEMP;
	}

	public double getSHORT_TERM_FUEL_TRIM_1() {
		return SHORT_TERM_FUEL_TRIM_1;
	}

	public void setSHORT_TERM_FUEL_TRIM_1(double sHORT_TERM_FUEL_TRIM_1) {
		SHORT_TERM_FUEL_TRIM_1 = sHORT_TERM_FUEL_TRIM_1;
	}

	public double getLONG_TERM_FUEL_TRIM_1() {
		return LONG_TERM_FUEL_TRIM_1;
	}

	public void setLONG_TERM_FUEL_TRIM_1(double lONG_TERM_FUEL_TRIM_1) {
		LONG_TERM_FUEL_TRIM_1 = lONG_TERM_FUEL_TRIM_1;
	}

	public double getSHORT_TERM_FUEL_TRIM_2() {
		return SHORT_TERM_FUEL_TRIM_2;
	}

	public void setSHORT_TERM_FUEL_TRIM_2(double sHORT_TERM_FUEL_TRIM_2) {
		SHORT_TERM_FUEL_TRIM_2 = sHORT_TERM_FUEL_TRIM_2;
	}

	public double getLONG_TERM_FUEL_TRIM_2() {
		return LONG_TERM_FUEL_TRIM_2;
	}

	public void setLONG_TERM_FUEL_TRIM_2(double lONG_TERM_FUEL_TRIM_2) {
		LONG_TERM_FUEL_TRIM_2 = lONG_TERM_FUEL_TRIM_2;
	}

	public double getRPM() {
		return RPM;
	}

	public void setRPM(Integer rPM) {
		RPM = rPM;
	}

	public Integer getSPEED() {
		return SPEED;
	}

	public void setSPEED(String SPEED) {
		SPEED = SPEED;
	}

	public double getTIMING_ADVANCE() {
		return TIMING_ADVANCE;
	}

	public void setTIMING_ADVANCE(double tIMING_ADVANCE) {
		TIMING_ADVANCE = tIMING_ADVANCE;
	}

	public double getTHROTTLE_POS() {
		return THROTTLE_POS;
	}

	public void setTHROTTLE_POS(double tHROTTLE_POS) {
		THROTTLE_POS = tHROTTLE_POS;
	}

	public double getREL_THROTTLE_POS() {
		return REL_THROTTLE_POS;
	}

	public void setREL_THROTTLE_POS(double rEL_THROTTLE_POS) {
		REL_THROTTLE_POS = rEL_THROTTLE_POS;
	}

	public double getMAF() {
		return MAF;
	}

	public void setMAF(double mAF) {
		MAF = mAF;
	}

	public double getENGINE_RUNTIME() {
		return ENGINE_RUNTIME;
	}

	public void setENGINE_RUNTIME(double eNGINE_RUNTIME) {
		ENGINE_RUNTIME = eNGINE_RUNTIME;
	}

	public double getFUEL_LEVEL() {
		return FUEL_LEVEL;
	}

	public void setFUEL_LEVEL(double fUEL_LEVEL) {
		FUEL_LEVEL = fUEL_LEVEL;
	}

	public double getEQUIV_RATIO() {
		return EQUIV_RATIO;
	}

	public void setEQUIV_RATIO(double eQUIV_RATIO) {
		EQUIV_RATIO = eQUIV_RATIO;
	}

	public double getAIR_FUEL_RATIO() {
		return AIR_FUEL_RATIO;
	}

	public void setAIR_FUEL_RATIO(double aIR_FUEL_RATIO) {
		AIR_FUEL_RATIO = aIR_FUEL_RATIO;
	}

	public double getWIDEBAND_AIR_FUEL_RATIO() {
		return WIDEBAND_AIR_FUEL_RATIO;
	}

	public void setWIDEBAND_AIR_FUEL_RATIO(double wIDEBAND_AIR_FUEL_RATIO) {
		WIDEBAND_AIR_FUEL_RATIO = wIDEBAND_AIR_FUEL_RATIO;
	}

	public double getAMBIENT_AIR_TEMP() {
		return AMBIENT_AIR_TEMP;
	}

	public void setAMBIENT_AIR_TEMP(Integer aMBIENT_AIR_TEMP) {
		AMBIENT_AIR_TEMP = aMBIENT_AIR_TEMP;
	}

	public double getFUEL_TYPE() {
		return FUEL_TYPE;
	}

	public void setFUEL_TYPE(Integer fUEL_TYPE) {
		FUEL_TYPE = fUEL_TYPE;
	}

	public double getETHANOL_PERCENTAGE() {
		return ETHANOL_PERCENTAGE;
	}

	public void setETHANOL_PERCENTAGE(Integer eTHANOL_PERCENTAGE) {
		ETHANOL_PERCENTAGE = eTHANOL_PERCENTAGE;
	}

	/*public double getRELATIVE_ACCELERATOR_POSITION() {
		return RELATIVE_ACCELERATOR_POSITION;
	}

	public void setRELATIVE_ACCELERATOR_POSITION(Integer rELATIVE_ACCELERATOR_POSITION) {
		RELATIVE_ACCELERATOR_POSITION = rELATIVE_ACCELERATOR_POSITION;
	}*/

	public double getFUEL_CONSUMPTION_RATE() {
		return FUEL_CONSUMPTION_RATE;
	}

	public void setFUEL_CONSUMPTION_RATE(double fUEL_CONSUMPTION_RATE) {
		FUEL_CONSUMPTION_RATE = fUEL_CONSUMPTION_RATE;
	}

	/*public double getENGINE_FUEL_RATE() {
		return ENGINE_FUEL_RATE;
	}

	public void setENGINE_FUEL_RATE(double eNGINE_FUEL_RATE) {
		ENGINE_FUEL_RATE = eNGINE_FUEL_RATE;
	}*/

	
	/*Deserializing*/
    @JsonProperty("readings")
    private void unpackNested(Map<String,String> readings) throws JsonMappingException {
	    try {
	    	this.SPEED = (readings.get("SPEED").contains("NODATA")) ? 0 : Integer.parseInt(readings.get("SPEED").replaceAll("[^\\d.-]", ""));
	    }catch (Exception e){
			 System.out.println("Speed not included");
		}
    	try {
    		this.ENGINE_LOAD = (readings.get("ENGINE_LOAD").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("ENGINE_LOAD").replaceAll("[^\\d.-]", ""));
	    }catch (Exception e){
			 System.out.println("Engine Load not included");
		}
    	try {
	    	this.ENGINE_COOLANT_TEMP = (readings.get("ENGINE_COOLANT_TEMP").contains("NODATA")) ? 0 : Integer.parseInt(readings.get("ENGINE_COOLANT_TEMP").replaceAll("[^\\d.-]", ""));
	    }catch (Exception e){
			 System.out.println("Engine Coolant not included");
		}
    	try {
	    	this.SHORT_TERM_FUEL_TRIM_1 = (readings.get("Short Term Fuel Trim Bank 1").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("Short Term Fuel Trim Bank 1").replaceAll("[^\\d.-]", ""));
	    }catch (Exception e){
			 System.out.println("Short Term Fuel Trim Bank 1 not included");
		}
    	try {	
	    	this.LONG_TERM_FUEL_TRIM_1 = (readings.get("Long Term Fuel Trim Bank 1").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("Long Term Fuel Trim Bank 1").replaceAll("[^\\d.-]", ""));
	    }catch (Exception e){
			 System.out.println("Long Term Fuel Trim Bank 1 not included");
		}
    	try {
	    	this.SHORT_TERM_FUEL_TRIM_2 = (readings.get("Short Term Fuel Trim Bank 2").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("Short Term Fuel Trim Bank 2").replaceAll("[^\\d.-]", ""));
	    }catch (Exception e){
			 System.out.println("Short Term Fuel Trim Bank 2 not included");
		}
    	try {
	    	this.LONG_TERM_FUEL_TRIM_2 = (readings.get("Long Term Fuel Trim Bank 2").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("Long Term Fuel Trim Bank 2").replaceAll("[^\\d.-]", ""));
	    }catch (Exception e){
			 System.out.println("Long Term Fuel Trim Bank 2 not included");
		}
    	try {
	    	this.RPM = (readings.get("ENGINE_RPM").contains("NODATA")) ? 0 : Integer.parseInt(readings.get("ENGINE_RPM").replaceAll("[^\\d.-]", ""));
	    }catch (Exception e){
			 System.out.println("Engine RPM not included");
		}
    	try {
	    	this.TIMING_ADVANCE = (readings.get("TIMING_ADVANCE").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("TIMING_ADVANCE").replaceAll("[^\\d.-]", ""));
	    }catch (Exception e){
			 System.out.println("Timing Advance not included");
		}
    	try {
    		this.THROTTLE_POS = (readings.get("THROTTLE_POS").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("THROTTLE_POS").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
   		 	System.out.println("Throttle Position not included");
    	}
    	try {
    		this.REL_THROTTLE_POS = (readings.get("REL_THROTTLE_POS").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("REL_THROTTLE_POS").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		System.out.println("Relative throttle position not included");
    	}
    	try {
    	this.MAF = (readings.get("MAF").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("MAF").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		System.out.println("Mass Air Flow not included");
    	}
    	try {
    		this.ENGINE_RUNTIME = (readings.get("ENGINE_RUNTIME").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("ENGINE_RUNTIME").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
   		 	System.out.println("Engine Runtime not included");
    	}
    	try {
    		this.FUEL_LEVEL=(readings.get("FUEL_LEVEL").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("FUEL_LEVEL").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		 System.out.println("Fuel Level not included");
    	}
    	try {
    		this.EQUIV_RATIO = (readings.get("EQUIV_RATIO").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("EQUIV_RATIO").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		System.out.println("Command Equivalence Ratio not included");
    	}
    	try {
    		this.AIR_FUEL_RATIO = (readings.get("AIR_FUEL_RATIO").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("AIR_FUEL_RATIO").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		System.out.println("Air/Fuel Ratio not included");
    	}
    	try {
    		this.WIDEBAND_AIR_FUEL_RATIO = (readings.get("WIDEBAND_AIR_FUEL_RATIO").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("WIDEBAND_AIR_FUEL_RATIO").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		System.out.println("Wideband Air/Fuel Ratio not included");
    	}
    	try {
    		this.AMBIENT_AIR_TEMP = (readings.get("AMBIENT_AIR_TEMP").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("AMBIENT_AIR_TEMP").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		System.out.println("Ambient Air Temperature not included");
    	}
    	try {
    	    this.FUEL_TYPE = (readings.get("FUEL_TYPE").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("FUEL_TYPE").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		System.out.println("Fuel Type not included");
    	}
    	try {
        	this.FUEL_CONSUMPTION_RATE = (readings.get("FUEL_CONSUMPTION_RATE").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("FUEL_CONSUMPTION_RATE").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		System.out.println("Fuel Consumption Rate not included");
    	}
    	try {
        	this.ETHANOL_PERCENTAGE = (readings.get("Ethanol Percentage").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("Ethanol Percentage").replaceAll("[^\\d.-]", ""));
    	}catch (Exception e){
    		System.out.println("Ethanol Percentage not included");
    	}
    	
    	//this.ENGINE_FUEL_RATE = (readings.get("Engine Fuel Rate").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("Engine Fuel Rate").replaceAll("[^\\d.-]", ""));
    	//this.RELATIVE_ACCELERATOR_POSITION = (readings.get("RELATIVE_ACCELERATOR_POSITION").contains("NODATA")) ? 0 : Double.parseDouble(readings.get("Throttle Position").replaceAll("[^\\d.-]", ""));
    	
    }


	
}
