package com.guide.c2;

/**
 * Try This 2-1
 * Compute the distance to a large object
 * such a rock or wall, by timing the echo.
 */
public class SoundExt {
    public static void main(String[] args) {
        double echoTime = 5;
        short speedOfSound = 1100; // feet per second through air

        double dist = (echoTime * speedOfSound) / 2;

        System.out.println("The big object is " + dist + " feet away");
    }
}
