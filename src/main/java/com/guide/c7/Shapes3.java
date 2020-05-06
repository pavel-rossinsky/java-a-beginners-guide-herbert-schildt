package com.guide.c7;

public class Shapes3 {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("filled", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("outlined", 8.0, 12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
