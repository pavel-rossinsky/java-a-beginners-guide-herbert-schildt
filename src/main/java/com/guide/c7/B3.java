package com.guide.c7;

public class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k - this overriders show() in A
    void show() {
        super.show(); // this calls A's show()
        System.out.println("k: " + k);
    }
}
