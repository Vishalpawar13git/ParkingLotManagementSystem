package com.oopsBasedMiniProject;

import java.util.Scanner;

public class InputHelper {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ParkingLot parkingLot = new ParkingLot();

		while (true) {
			System.out.println("\n--- Parking Lot Management System ---");
			System.out.println("1. Add Vehicle");
			System.out.println("2. Display All Vehicles");
			System.out.println("3. Search Vehicle by Number");
			System.out.println("4. Count Vehicles by Type");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				// Add Vehicle
				System.out.print("Enter Vehicle Number: ");
				String number = scanner.nextLine();

				System.out.print("Enter Owner Name: ");
				String owner = scanner.nextLine();

				System.out.print("Enter Vehicle Type (car/bike/truck): ");
				String type = scanner.nextLine();

				// Use setters
				Vehicle v = new Vehicle();
				v.setVehicleNumber(number);
				v.setOwenerName(owner);
				v.setVehicleType(type);

				parkingLot.addVehicle(v);
				break;

			case 2:
				// Display all vehicles
				parkingLot.displayVehicles();
				break;

			case 3:
				// Search by vehicle number
				System.out.print("Enter Vehicle Number to Search: ");
				String searchNumber = scanner.nextLine();
				parkingLot.searchVehicle(searchNumber);
				break;

			case 4:
				// Count by vehicle type
				System.out.print("Enter Vehicle Type to Count (car/bike/truck): ");
				String countType = scanner.nextLine();
				parkingLot.countVehiclesByType(countType);
				break;

			case 5:
				// Exit
				System.out.println(" Exiting the system. Thank you!");
				scanner.close();
				return;

			default:
				System.out.println(" Invalid choice. Please try again.");
			}
		}
	}
}
