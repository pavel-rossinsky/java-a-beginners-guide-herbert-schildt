package com.guide.c6;

// Show the swap() method.
public class SelfTest4 {
    int a;

    SelfTest4(int i) {
        a = i;
    }

    public void swap(SelfTest4 t1, SelfTest4 t2) {
        int b = t1.a;
        t1.a = t2.a;
        t2.a = t1.a;
    }
}
