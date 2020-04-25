package com.guide.c2;

// Demonstrate the short-circuit operators.
public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0;

        // Since d is zero, the second operand is not evaluated.
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        // cause division by zero
        if (d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
}
