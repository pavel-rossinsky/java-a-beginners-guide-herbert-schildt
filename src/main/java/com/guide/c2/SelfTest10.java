package com.guide.c2;

// Find all of the prime numbers between 2 and 100.
public class SelfTest10 {
    public static void main(String[] args) {
        mainLoop: for (int i = 2, j = 100; i <= j; i++) {
            int d = i;

            while (--d > 1) {
                if (i % d == 0) {
                    continue mainLoop;
                }
            }

            System.out.print(i + " ");
        }
    }
}
