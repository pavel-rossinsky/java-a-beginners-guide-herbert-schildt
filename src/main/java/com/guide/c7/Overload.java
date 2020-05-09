package com.guide.c7;

public class Overload {
    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);
        subOb.show("This is k: "); // this calls show() in B
        subOb.show(); // this calls show() in A
    }
}
