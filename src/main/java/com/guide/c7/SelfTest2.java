package com.guide.c7;

// Create a subclass of TwoDShape to represent a Circle.
public class SelfTest2 extends TwoDShape9 {
    // A default constructor.
    SelfTest2() {
        super();
    }

    // Construct Circle
    SelfTest2(double x) {
        super(x, "circle"); // call superclass constructor
    }

    // Construct an object from an object.
    SelfTest2(SelfTest2 ob) {
        super(ob); // pass object to TwoDShape constructor
    }

    double area() {
        return 3.14156 * Math.pow(getWidth() / 2, 2);
    }
}
