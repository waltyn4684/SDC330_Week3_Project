/*
Name: Wallace Tyner
Course: SDC330
Assignment: Week 3 Project – Class Implementation

Description:
Represents engine details.
Used in composition within Automobile class.
*/

public class Engine {
    private int cylinders;
    private String gasType;
    private boolean fuelInjected;

    // Constructor (THIS fixes your error)
    public Engine(int cylinders, String gasType, boolean fuelInjected) {
        this.cylinders = cylinders;
        this.gasType = gasType;
        this.fuelInjected = fuelInjected;
    }

    // Getter (THIS fixes your error)
    public int getCylinders() {
        return cylinders;
    }
}