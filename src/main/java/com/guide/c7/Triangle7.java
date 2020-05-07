package com.guide.c7;

// A subclass of TwoDShape for triangles.
public class Triangle7 extends TwoDShape7 {
    private String style;

    // A default constructor.
    Triangle7() {
        super();
        style = "none";
    }

    // Constructor
    Triangle7(String s, double w, double h) {
        super(w, h);

        style = s;
    }

    // one argument constructor.
    Triangle7(double x) {
        super(x); // call superclass constructor

        style = "filled";
    }

    // Construct an object from on object.
    Triangle7(Triangle7 ob) {
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
