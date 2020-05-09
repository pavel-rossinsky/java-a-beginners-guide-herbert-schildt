package com.guide.c7;

// A subclass of TwoDShape for rectangles.
public class Rectangle9 extends TwoDShape9 {
    Rectangle9() {
        super();
    }

    // Constructor for Rectangle.
    Rectangle9(double w, double h) {
        super(w, h, "rectangle");
    }

    // Construct a square.
    Rectangle9(double x) {
        super(x, "rectangle");
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) return true;
        return false;
    }

    // Override area for Rectangle.
    double area() {
        return getWidth() * getHeight();
    }
}
