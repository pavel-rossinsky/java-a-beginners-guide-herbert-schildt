package com.guide.c7;

// A subclass of TwoDShape for triangles.
public class Triangle5 extends TwoDShape5 {
    private String style;

    // A default constructor.
    Triangle5() {
        super();
        style = "none";
    }

    // Constructor
    Triangle5(String s, double w, double h) {
        super(w, h);

        style = s;
    }

    // one argument constructor.
    Triangle5(double x) {
        super(x); // call superclass constructor

        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
