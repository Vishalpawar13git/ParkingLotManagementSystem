package com.oopsBasedMiniProject;

public class ParkingLot {
    private Vehicle[] parkingSpaces = new Vehicle[Constant.MAX_PARKING_SPACES];
    private int count = 0;

    public void setParkingSpaces(Vehicle[] parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public Vehicle[] getParkingSpaces() {
        return parkingSpaces;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void addVehicle(Vehicle vehicle) {
        if (getCount() < Constant.MAX_PARKING_SPACES) {
            parkingSpaces[getCount()] = vehicle;
            setCount(getCount() + 1);
            System.out.println(" Vehicle added successfully.");
        } else {
            System.out.println(" Parking lot is full.");
        }
    }

    public void displayVehicles() {
        if (getCount() == 0) {
            System.out.println("No vehicles parked.");
            return;
        }

        System.out.println("\n--- Parked Vehicles ---");
        for (int i = 0; i < getCount(); i++) {
            System.out.println(getParkingSpaces()[i]);
        }
    }

    public void searchVehicle(String vehicleNumber) {
        boolean found = false;
        for (int i = 0; i < getCount(); i++) {
        	 if (getParkingSpaces()[i].getVehicleNumber().equalsIgnoreCase(vehicleNumber)) {
                System.out.println("Vehicle Found: " + getParkingSpaces()[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(" Vehicle with number " + vehicleNumber + " not found.");
        }
    }

    public void countVehiclesByType(String type) {
        int total = 0;
        for (int i = 0; i < getCount(); i++) {
            if (getParkingSpaces()[i].getVehicleType().equalsIgnoreCase(type)) {
                total++;
            }
        }
        System.out.println(" Total " + type + "(s): " + total);
    }
}
