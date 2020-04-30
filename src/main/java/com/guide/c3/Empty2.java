package com.guide.c3;

// Move more out of the for loop.
public class Empty2 {
    public static void main(String[] args) {
        int i;

        i = 0; // move initialization out of the loop.
        for (; i < 10; ) { // the iteration expression is missing.
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}
