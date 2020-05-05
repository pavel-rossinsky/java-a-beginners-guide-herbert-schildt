package com.guide.c6;

public class QSDemo {
    public static void main(String[] args) {
        char[] a = { 'd', 'x' , 'a', 'r', 'p', 'j', 'i' };
        int i;

        System.out.print("Original array: ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]);

        System.out.println();

        // now, sort the array
        Quicksort.qsort(a);

        System.out.print("Sorted array: ");
        for (i=0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println();
    }
}
