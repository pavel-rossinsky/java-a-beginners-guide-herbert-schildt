package com.guide.c6;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        // Access to alpha is allowed only through its accessor methods.
        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

        // ob.alpha = 10; // compilation error

        // There are OK because beta and gamma are public
        ob.beta = 88;
        ob.gamma = 99;
    }
}
