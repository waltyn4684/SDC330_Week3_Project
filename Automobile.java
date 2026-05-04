/*
Name: Wallace Tyner
Course: SDC330
Assignment: Week 3 Project – Class Implementation

Description:
Concrete class that extends Vehicle.
Demonstrates inheritance, composition, and interface usage.
*/

import java.util.ArrayList;

public class Automobile extends Vehicle implements DisplayInfo {

    private String color;
    private String bodyStyle;
    private Engine engine;
    private ArrayList<Tire> tires;

    // Constructor
    public Automobile(String make, String model, String color, String bodyStyle, Engine engine) {
        super(make, model);
        this.color = color;
        this.bodyStyle = bodyStyle;
        this.engine = engine;
        this.tires = new ArrayList<>();
    }

    // Method to add tire
    public void addTire(Tire tire) {
        tires.add(tire);
    }

    // Abstract method implementation
    @Override
    public void getInfo() {
        System.out.println(make + " " + model);
    }

    // Interface method implementation
    @Override
    public void displayDetails() {
        System.out.println("Car: " + make + " " + model);
        System.out.println("Color: " + color);
        System.out.println("Body Style: " + bodyStyle);

        System.out.println("\nEngine Info:");
        System.out.println("Cylinders: " + engine.getCylinders());

        System.out.println("\nTires:");
        for (Tire t : tires) {
            System.out.println(t.getManufacturer() + " - " + t.getSize());
        }
    }
}
