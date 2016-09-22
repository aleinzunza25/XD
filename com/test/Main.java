package com.test;

public class Main {

    public static void main(String[] args) {
        Bicycle[] bikes = new Bicycle[3];
        bikes[0] = new Bicycle(20, 10, 1);
        bikes[1] = new MountainBike(20, 10, 5, "Dual");
        bikes[2] = new RoadBike(40, 20, 8, 23);

        for (int i = 0; i < bikes.length; i++) {
            printDetails(bikes[i]);
        }
    }

    public static void printDetails(Bicycle b) {
        b.printDescription();
    }
}
