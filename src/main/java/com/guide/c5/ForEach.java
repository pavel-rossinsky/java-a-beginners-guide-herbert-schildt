package com.guide.c5;

// Use a for-each style for loop.
public class ForEach {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Use for-each style for to display and sum the values.
        for (int x : nums) { // a for-each style for loop
            System.out.println("Value is: " + x);
            sum += x;
        }

        System.out.println("Summation: " + sum);
    }
}
