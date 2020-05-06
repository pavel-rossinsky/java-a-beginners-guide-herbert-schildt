package com.guide.c7;

public class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds

    // This is a constructor for Truck.
    Truck(int p, int f, int m, int c) {
        super(p, f, m);

        cargocap = c;
    }

    int getCargocap() {
        return cargocap;
    }

    void setCargocap(int c) {
        cargocap = c;
    }
}
