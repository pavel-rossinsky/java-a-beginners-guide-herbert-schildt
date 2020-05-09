package com.guide.c7;

// A subclass of TwoDShape for triangles.
public class Triangle3 extends TwoDShape2 {
    private String style;

    Triangle3(String s, double w, double h) {
        setWidth(w);
        setHeight(h);

        style = s;
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
