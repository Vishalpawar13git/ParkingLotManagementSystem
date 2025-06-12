package com.oopsBasedMiniProject;


public class Vehicle {
	
	private String vehicleNumber ;
	
	private String owenerName;
	
	private String vehicleType;

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getOwenerName() {
		return owenerName;
	}

	public void setOwenerName(String owenerName) {
		this.owenerName = owenerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", owenerName=" + owenerName + ", vehicleType=" + vehicleType
				+ "]";
	}
	
	

}
