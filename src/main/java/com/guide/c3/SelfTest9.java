package com.guide.c3;

/**
 * Write a program that uses a for loop to generate and display the progression
 * 1, 2, 4, 8, 16, 32, and so on.
 */
public class SelfTest9 {
    public static void main(String[] args) {
        System.out.println("Progression: ");
        for (int i = 0; i <= 10; ) {
            System.out.println((int)Math.pow(2, i++));
        }
    }
}
