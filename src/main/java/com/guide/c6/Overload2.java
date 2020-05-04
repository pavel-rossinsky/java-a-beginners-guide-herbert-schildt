package com.guide.c6;

/**
 * Automatic type conversions can affect
 * overloaded method resolution.
 */
public class Overload2 {
    void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    void f(double x) {
        System.out.println("Inside f(double): " + x);
    }
}
