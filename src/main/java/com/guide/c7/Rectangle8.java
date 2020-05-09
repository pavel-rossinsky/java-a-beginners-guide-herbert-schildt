package com.guide.c7;

// A subclass of TwoDShape for rectangles.
public class Rectangle8 extends TwoDShape8 {
    Rectangle8() {
        super();
    }

    // Constructor for Rectangle.
    Rectangle8(double w, double h) {
        super(w, h, "rectangle");
    }

    // Construct a square.
    Rectangle8(double x) {
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
