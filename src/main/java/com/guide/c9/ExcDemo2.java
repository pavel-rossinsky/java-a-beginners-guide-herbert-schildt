package com.guide.c9;

public class ExcDemo2 {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception.
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
