package com.guide.c8;

public interface IVehicle {
    // Return the range.
    int range();

    // Compute fuel needed for a given distance.
    double fuelneeded(int miles);

    // Access methods for instance variables.
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
