package com.guide.c5;

/**
 *  * Demonstrate the Bubble sort for strings.
 */
public class SelfTest4 {
    public static void main(String[] args) {
        String[] numstrs = {"99", "-10", "100123", "18", "-978", "5623", "463", "-9", "287", "49"};

        int a, b;
        String t;

        System.out.print("Original array is: ");
        for (int i = 0; i < numstrs.length; i++)
            System.out.print(" " + numstrs[i]);
        System.out.println();

        for (a = 1; a < numstrs.length; a++) {
            for (b = numstrs.length - 1; b >= a; b--) {
                //System.out.println("Comparing [b] to [b - 1], result: " + numstrs[b] + " : " + numstrs[b - 1] + ", " + numstrs[b].compareTo(numstrs[b - 1]));
                if (numstrs[b].compareTo(numstrs[b - 1]) < 0) {
                    t = numstrs[b - 1];
                    numstrs[b - 1] = numstrs[b];
                    numstrs[b] = t;
                }
            }
        }

        // display sorted array
        System.out.print("Sorted array is: ");
        for (int i = 0; i < numstrs.length; i++)
            System.out.print(" " + numstrs[i]);
        System.out.println();
    }
}
