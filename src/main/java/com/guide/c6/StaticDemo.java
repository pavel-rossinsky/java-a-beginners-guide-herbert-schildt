package com.guide.c6;

// Use a static variable.
public class StaticDemo {
    int x; // a normal instance variable
    static int y; // a static variable

    // Return the sum of the instance variable x
    // and the static variable y.
    int sum() {
        return x + y;
    }
}
