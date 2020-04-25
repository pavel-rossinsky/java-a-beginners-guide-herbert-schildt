package com.guide.c2;

/**
 * Demonstrate boolean values.
 */
public class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if (b) System.out.println("This is executed");

        b = false;

        if (b) System.out.println("This is not executed");

        System.out.println("10 > 9 is " + (10 > 9));
    }
}
