package com.guide.c7;

// Add constructors to the class.
public class TwoDShape5 {
    private double width;
    private double height;

    // A default constructor.
    TwoDShape5() {
        width = height = 0.0;
    }

    // Parameterized constructor.
    TwoDShape5(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal with and height
    TwoDShape5(double x) {
        width = height = x;
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

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}