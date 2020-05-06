package com.guide.c7;

// A subclass of TwoDShape for triangles.
public class Triangle4 extends TwoDShape4 {
    private String style;

    Triangle4(String s, double w, double h) {
        super(w, h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
