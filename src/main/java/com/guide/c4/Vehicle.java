package com.guide.c4;

public class Vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon

    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }
}
