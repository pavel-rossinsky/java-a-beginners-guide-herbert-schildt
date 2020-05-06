package com.guide.c7;

// Add constructors to the class.
public class TwoDShape4 {
    private double width;
    private double height;

    TwoDShape4(double w, double h) {
        width = w;
        height = h;
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