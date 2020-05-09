package com.guide.c7;

// A subclass of TwoDShape for triangles.
public class Triangle8 extends TwoDShape8 {
    private String style;

    // A default constructor.
    Triangle8() {
        super();
        style = "none";
    }

    // Constructor
    Triangle8(String s, double w, double h) {
        super(w, h, "triangle");

        style = s;
    }

    // one argument constructor.
    Triangle8(double x) {
        super(x, "triangle"); // call superclass constructor

        style = "filled";
    }

    // Construct an object from on object.
    Triangle8(Triangle8 ob) {
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