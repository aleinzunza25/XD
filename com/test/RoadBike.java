package com.test;

/**
 * Created by atempa on 21/09/16.
 */
public class RoadBike extends Bicycle {
    // In millimeters (mm)
    private int tireWidth;

    public RoadBike(int startCadence, int startSpeed, int startGear, int newTireWidth) {
        super(startCadence, startSpeed, startGear);
        this.setTireWidth(newTireWidth);
    }

    public int getTireWidth() {
        return this.tireWidth;
    }

    public void setTireWidth(int newTireWidth) {
        this.tireWidth = newTireWidth;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("The RoadBike has " + getTireWidth() + " MM tires.");
    }
}