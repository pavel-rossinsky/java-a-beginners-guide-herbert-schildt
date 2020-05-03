package com.guide.c5;

public class SelfTest3 {
    public static void main(String[] args) {
        double[] x = { 1.2, 1.3, 3.3, 3.5, 3.1, 7.55, 3.1416, 1.167, 6.33, 0.7 };
        double avg = 0.0;

        for (double v : x) {
            avg += v;
        }
        avg /= x.length;

        System.out.println("Average of the x array is: " + avg);
    }
}
