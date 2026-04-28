/*
Name: Wallace Tyner
Course: SDC330
Assignment: Week 3 Project – Class Implementation

Description:
Represents tire information.
Multiple Tire objects are stored in Automobile (composition).
*/

public class Tire {
    private String manufacturer;
    private String size;
    private int maxPressure;
    private int minPressure;
    private String type;

    public Tire(String manufacturer, String size, int maxPressure, int minPressure, String type) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.maxPressure = maxPressure;
        this.minPressure = minPressure;
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSize() {
        return size;
    }
}