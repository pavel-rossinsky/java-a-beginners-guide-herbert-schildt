package com.guide.c7;

public class TwoDShape8 {
    private double width;
    private double height;
    private String name;

    // A default constructor.
    TwoDShape8() {
        width = height = 0.0;
        name = "none";
    }

    // Parameterized constructor.
    TwoDShape8(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Construct object with equal with and height
    TwoDShape8(double x, String n) {
        width = height = x;
        name  = n;
    }

    // Construct an object from an object.
    TwoDShape8(TwoDShape8 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods for with and height.
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }
    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    double area() {
        System.out.println("area () must be overridden");
        return 0.0;
    }
}
