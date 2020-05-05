package com.guide.c6;

// A simple example of recursion.
public class Factorial {
    // This is a recursive function.
    int factR(int n) {
        int result;
        if (n == 1) return 1;
        result = factR(n-1) * n;
        return result;
    }

    // This is an iterative equivalent.
    int factI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++) result *= t;
        return result;
    }
}
