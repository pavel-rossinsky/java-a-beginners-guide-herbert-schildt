package com.guide.c3;

// Use continue.
public class ContDemo {
    public static void main(String[] args) {
        int i;

        // print even numbers between 0 and 100
        for (i = 1; i <= 100; i++) {
            if ((i % 2) != 0) continue;
            System.out.println(i);
        }
    }
}
