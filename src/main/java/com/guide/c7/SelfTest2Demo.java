package com.guide.c7;

public class SelfTest2Demo {
    public static void main(String[] args) {
        SelfTest2 circle1 = new SelfTest2();
        System.out.println("Area of circle1: " + circle1.area());
        System.out.println("Name of circle1: " + circle1.getName());
        System.out.println();

        SelfTest2 circle2 = new SelfTest2(11);
        System.out.println("Area of circle2: " + circle2.area());
        System.out.println("Name of circle2: " + circle2.getName());
        System.out.println();

        SelfTest2 circle3 = new SelfTest2(circle2);
        System.out.println("Area of circle3: " + circle3.area());
        System.out.println("Name of circle3: " + circle3.getName());
    }
}
