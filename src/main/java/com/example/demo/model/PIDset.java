package com.example.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class PIDset {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private float ENGINE_LOAD;
	private float ENGINE_COOLANT_TEMP;
	private float SHORT_TERM_FUEL_TRIM_1;
	private float LONG_TERM_FUEL_TRIM_1;
	private float SHORT_TERM_FUEL_TRIM_2;
	private float LONG_TERM_FUEL_TRIM_2;
	private Integer RPM;
	private Integer SPEED;
	private float TIMING_ADVANCE;
	private float THROTTLE_POS;
	private float REL_THROTTLE_POS;
	private float MAF;
	private float ENGINE_RUNTIME;
	private float FUEL_LEVEL;
	private float EQUIV_RATIO;
	private float AIR_FUEL_RATIO;
	private float WIDEBAND_AIR_FUEL_RATIO;
	private int AMBIENT_AIR_TEMP;
	private int FUEL_TYPE;
	private int ETHANOL_PERCENTAGE;
	private int RELATIVE_ACCELERATOR_POSITION;
	private float FUEL_CONSUMPTION_RATE;
	private float ENGINE_FUEL_RATE;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getENGINE_LOAD() {
		return ENGINE_LOAD;
	}
	public void setENGINE_LOAD(float eNGINE_LOAD) {
		ENGINE_LOAD = eNGINE_LOAD;
	}
	public float getENGINE_COOLANT_TEMP() {
		return ENGINE_COOLANT_TEMP;
	}
	public void setENGINE_COOLANT_TEMP(float eNGINE_COOLANT_TEMP) {
		ENGINE_COOLANT_TEMP = eNGINE_COOLANT_TEMP;
	}
	public float getSHORT_TERM_FUEL_TRIM_1() {
		return SHORT_TERM_FUEL_TRIM_1;
	}
	public void setSHORT_TERM_FUEL_TRIM_1(float sHORT_TERM_FUEL_TRIM_1) {
		SHORT_TERM_FUEL_TRIM_1 = sHORT_TERM_FUEL_TRIM_1;
	}
	public float getLONG_TERM_FUEL_TRIM_1() {
		return LONG_TERM_FUEL_TRIM_1;
	}
	public void setLONG_TERM_FUEL_TRIM_1(float lONG_TERM_FUEL_TRIM_1) {
		LONG_TERM_FUEL_TRIM_1 = lONG_TERM_FUEL_TRIM_1;
	}
	public float getSHORT_TERM_FUEL_TRIM_2() {
		return SHORT_TERM_FUEL_TRIM_2;
	}
	public void setSHORT_TERM_FUEL_TRIM_2(float sHORT_TERM_FUEL_TRIM_2) {
		SHORT_TERM_FUEL_TRIM_2 = sHORT_TERM_FUEL_TRIM_2;
	}
	public float getLONG_TERM_FUEL_TRIM_2() {
		return LONG_TERM_FUEL_TRIM_2;
	}
	public void setLONG_TERM_FUEL_TRIM_2(float lONG_TERM_FUEL_TRIM_2) {
		LONG_TERM_FUEL_TRIM_2 = lONG_TERM_FUEL_TRIM_2;
	}
	public Integer getRPM() {
		return RPM;
	}
	public void setRPM(Integer rPM) {
		RPM = rPM;
	}
	public Integer getSPEED() {
		return SPEED;
	}
	public void setSPEED(Integer sPEED) {
		SPEED = sPEED;
	}
	public float getTIMING_ADVANCE() {
		return TIMING_ADVANCE;
	}
	public void setTIMING_ADVANCE(float tIMING_ADVANCE) {
		TIMING_ADVANCE = tIMING_ADVANCE;
	}
	public float getTHROTTLE_POS() {
		return THROTTLE_POS;
	}
	public void setTHROTTLE_POS(float tHROTTLE_POS) {
		THROTTLE_POS = tHROTTLE_POS;
	}
	public float getREL_THROTTLE_POS() {
		return REL_THROTTLE_POS;
	}
	public void setREL_THROTTLE_POS(float rEL_THROTTLE_POS) {
		REL_THROTTLE_POS = rEL_THROTTLE_POS;
	}
	public float getMAF() {
		return MAF;
	}
	public void setMAF(float mAF) {
		MAF = mAF;
	}
	public float getENGINE_RUNTIME() {
		return ENGINE_RUNTIME;
	}
	public void setENGINE_RUNTIME(float eNGINE_RUNTIME) {
		ENGINE_RUNTIME = eNGINE_RUNTIME;
	}
	public float getFUEL_LEVEL() {
		return FUEL_LEVEL;
	}
	public void setFUEL_LEVEL(float fUEL_LEVEL) {
		FUEL_LEVEL = fUEL_LEVEL;
	}
	public float getEQUIV_RATIO() {
		return EQUIV_RATIO;
	}
	public void setEQUIV_RATIO(float eQUIV_RATIO) {
		EQUIV_RATIO = eQUIV_RATIO;
	}
	public float getAIR_FUEL_RATIO() {
		return AIR_FUEL_RATIO;
	}
	public void setAIR_FUEL_RATIO(float aIR_FUEL_RATIO) {
		AIR_FUEL_RATIO = aIR_FUEL_RATIO;
	}
	public float getWIDEBAND_AIR_FUEL_RATIO() {
		return WIDEBAND_AIR_FUEL_RATIO;
	}
	public void setWIDEBAND_AIR_FUEL_RATIO(float wIDEBAND_AIR_FUEL_RATIO) {
		WIDEBAND_AIR_FUEL_RATIO = wIDEBAND_AIR_FUEL_RATIO;
	}
	public int getAMBIENT_AIR_TEMP() {
		return AMBIENT_AIR_TEMP;
	}
	public void setAMBIENT_AIR_TEMP(int aMBIENT_AIR_TEMP) {
		AMBIENT_AIR_TEMP = aMBIENT_AIR_TEMP;
	}
	public int getFUEL_TYPE() {
		return FUEL_TYPE;
	}
	public void setFUEL_TYPE(int fUEL_TYPE) {
		FUEL_TYPE = fUEL_TYPE;
	}
	public int getETHANOL_PERCENTAGE() {
		return ETHANOL_PERCENTAGE;
	}
	public void setETHANOL_PERCENTAGE(int eTHANOL_PERCENTAGE) {
		ETHANOL_PERCENTAGE = eTHANOL_PERCENTAGE;
	}
	public int getRELATIVE_ACCELERATOR_POSITION() {
		return RELATIVE_ACCELERATOR_POSITION;
	}
	public void setRELATIVE_ACCELERATOR_POSITION(int rELATIVE_ACCELERATOR_POSITION) {
		RELATIVE_ACCELERATOR_POSITION = rELATIVE_ACCELERATOR_POSITION;
	}
	public float getFUEL_CONSUMPTION_RATE() {
		return FUEL_CONSUMPTION_RATE;
	}
	public void setFUEL_CONSUMPTION_RATE(float fUEL_CONSUMPTION_RATE) {
		FUEL_CONSUMPTION_RATE = fUEL_CONSUMPTION_RATE;
	}
	public float getENGINE_FUEL_RATE() {
		return ENGINE_FUEL_RATE;
	}
	public void setENGINE_FUEL_RATE(float eNGINE_FUEL_RATE) {
		ENGINE_FUEL_RATE = eNGINE_FUEL_RATE;
	}
	
	

}
