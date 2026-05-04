/*
Name: Wallace Tyner
Course: SDC330
Assignment: Week 4 Project – Database Implementation
Date: 3May2026

Description:
Main driver class. Runs the application, demonstrates OOP concepts,
and integrates SQLite database CRUD operations.
*/

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Week 4 Project ===");
        System.out.println("Vehicle Management System\n");

        // =========================
        // OOP DEMONSTRATION (Week 3)
        // =========================

        // Create engine object
        Engine engine = new Engine(4, "Gasoline", true);

        // Create automobile object
        Automobile car = new Automobile("Toyota", "Camry", "Blue", "Sedan", engine);

        // Add tires (composition)
        car.addTire(new Tire("Michelin", "205/55R16", 35, 30, "All-Season"));
        car.addTire(new Tire("Michelin", "205/55R16", 35, 30, "All-Season"));

        // Display vehicle details
        System.out.println("=== Vehicle Details ===");
        car.displayDetails();


        // =========================
        // DATABASE DEMONSTRATION (Week 4)
        // =========================

        System.out.println("\n=== Database Operations ===");

        VehicleDAO dao = new VehicleDAO();

        // Step 1: Create table
        dao.createTable();

        // Step 2: Insert data
        dao.insertVehicle("Toyota", "Camry", "Blue");
        dao.insertVehicle("Honda", "Accord", "Black");

        // Step 3: Display data
        System.out.println("\nVehicles in Database:");
        dao.displayVehicles();

        // Step 4: Update record
        dao.updateVehicle(1, "Red");

        System.out.println("\nAfter Update:");
        dao.displayVehicles();

        // Step 5: Delete record (optional but shows full CRUD)
        dao.deleteVehicle(2);

        System.out.println("\nAfter Delete:");
        dao.displayVehicles();

        System.out.println("\n=== Program Complete ===");
    }
}