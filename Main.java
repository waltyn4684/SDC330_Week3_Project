/*
Name: Wallace Tyner
Course: SDC330
Assignment: Week 3 Project – Class Implementation
Date: [enter date]

Description:
Main driver class. Runs the application and displays output
to demonstrate OOP concepts.
*/

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Week 3 Project ===");
        System.out.println("Vehicle Management System\n");

        // Create engine object
        Engine engine = new Engine(4, "Gasoline", true);

        // Create automobile object
        Automobile car = new Automobile("Toyota", "Camry", "Blue", "Sedan", engine);

        // Add tires (composition)
        car.addTire(new Tire("Michelin", "205/55R16", 35, 30, "All-Season"));
        car.addTire(new Tire("Michelin", "205/55R16", 35, 30, "All-Season"));

        // Display details
        car.displayDetails();
    }
}