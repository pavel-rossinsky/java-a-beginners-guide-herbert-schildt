package com.guide.c7;

public class Triangle6 extends TwoDShape6 {
    private String style;

    // A default constructor.
    Triangle6() {
        super();
        style = "none";
    }

    // Constructor
    Triangle6(String s, double w, double h) {
        super(w, h);

        style = s;
    }

    // one argument constructor.
    Triangle6(double x) {
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
