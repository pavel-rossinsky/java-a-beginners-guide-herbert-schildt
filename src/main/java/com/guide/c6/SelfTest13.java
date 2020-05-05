package com.guide.c6;

// Demonstrate a varargs method called sum() that sums the int values passed to it.
public class SelfTest13 {
    public static void main(String[] args) {
        SumIt siObj = new SumIt();

        int total = siObj.sum(1, 2, 3);
        System.out.println("Sum is " + total);

        total = siObj.sum(1, 2, 3, 4, 5);
        System.out.println("Sum is " + total);
    }
}
