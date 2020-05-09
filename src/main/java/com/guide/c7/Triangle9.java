package com.guide.c7;

// A subclass of TwoDShape for triangles.
public class Triangle9 extends TwoDShape9 {
    private String style;

    // A default constructor.
    Triangle9() {
        super();
        style = "none";
    }

    // Constructor
    Triangle9(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    // One argument constructor.
    Triangle9(double x) {
        super(x, "triangle"); // call superclass constructor

        style = "filled";
    }

    // Construct an object from on object.
    Triangle9(Triangle9 ob) {
        super(ob); // pass object to TwoDShape constructor
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
