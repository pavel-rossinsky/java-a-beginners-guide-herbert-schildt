package com.guide.c7;

// Methods with differing signatures are overloaded and not overridden.
public class A4 {
    int i, j;

    A4(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
