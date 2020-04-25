package com.guide.c2;

// Try this 2-2: a truth table for the logical operators.
// The program uses and displays 1's and 0's rather that true and false.
public class LogicalOpTable2 {
    public static void main(String[] args) {
        int p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = 1; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (p == 1 ? 0 : 1));

        p = 1; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (p == 1 ? 0 : 1));

        p = 0; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (p == 1 ? 0 : 1));

        p = 0; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (p == 1 ? 0 : 1));
    }
}
