package com.guide.c7;

// Compilation error: incompatible types
public class IncompatibleRef {
    public static void main(String[] args) {
        X x = new X(10);
        X x2;
        Y y = new Y(15);

        x2 = x; // OK, both of the same type

//        x2 = y; // Error, not of the same type
    }
}
