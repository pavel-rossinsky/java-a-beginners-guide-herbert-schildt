package com.guide.c6;

// Public vs private access.
public class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    /**
     * Methods to access alpha. It is OK for a member of a class
     * to access a private member of the same class.
     */
    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}
