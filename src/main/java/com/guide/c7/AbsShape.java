package com.guide.c7;

public class AbsShape {
    public static void main(String[] args) {
        TwoDShape9[] shapes = new TwoDShape9[4];

        shapes[0] = new Triangle9("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle9(10);
        shapes[2] = new Rectangle9(10, 4);
        shapes[3] = new Triangle9(7.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());

            System.out.println();
        }
    }
}
