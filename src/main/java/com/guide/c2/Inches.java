package com.guide.c2;

/**
 * Compute the number of cubic inches
 * in one cubic mile.
 */
public class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile.");
    }
}
