package com.guide.c2;

/**
 * Demonstrate automatic conversion from long to double.
 *
 * Compilation failure
 * [ERROR] /var/www/java-beginners-guide/src/main/java/com/guide/c2/LtoD2.java:[10,13] incompatible types: possible lossy conversion from double to long
 */
public class LtoD2 {
    public static void main(String[] args) {
        long L;
        double D;

        D = 100123285.0;
        // L = D; // Illegal, no automatic conversion from double to long.

        // System.out.println("L and D: " + L + " " + D);
    }
}
