package com.guide.c5;

// Demonstrate an array overrun.
public class ArrayErr {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        for (i = 0; i < 100; i++) {
            sample[i] = i;
        }
    }
}
