package com.guide.c7;

// A subclass of TwoDShape for triangles.
public class Triangle2 extends TwoDShape2 {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
