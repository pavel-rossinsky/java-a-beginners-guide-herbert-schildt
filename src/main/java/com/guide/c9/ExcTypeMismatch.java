package com.guide.c9;

// This won't work
public class ExcTypeMismatch {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("Before exception is generated.");

            // generate an index out-of-bounds exception
            nums[7] = 10;
            System.out.println("this won't be displayed");
        } catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement");
    }
}
