package com.guide.c7;

// Method overriding.
public class A3 {
    int i, j;
    A3(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
