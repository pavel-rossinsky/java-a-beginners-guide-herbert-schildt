package com.guide.c3;

// A negatively running for loop.
public class DecrFor {
    public static void main(String[] args) {
        int x;

        for (x = 100; x > -100; x -= 5) {
            System.out.println(x);
        }
    }
}
