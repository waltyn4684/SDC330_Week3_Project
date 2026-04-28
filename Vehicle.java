/*
Name: Wallace Tyner
Course: SDC330
Assignment: Week 3 Project – Class Implementation

Description:
Abstract base class representing a vehicle.
Demonstrates abstraction and inheritance.
*/

public abstract class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract void getInfo();
}