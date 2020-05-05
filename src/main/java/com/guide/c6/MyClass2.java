package com.guide.c6;

// Demonstrate an overloaded constructor.
public class MyClass2 {
    int x;

    MyClass2() {
        System.out.println("Inside MyClass2().");
        x = 0;
    }

    MyClass2(int i) {
        System.out.println("Inside MyClass2(int).");
        x = i;
    }

    MyClass2(double d) {
        System.out.println("Inside MyClass2(double).");
        x = (int) d;
    }

    MyClass2(int i, int j) {
        System.out.println("Inside MyClass2(int, int).");
        x = i * j;
    }
}
