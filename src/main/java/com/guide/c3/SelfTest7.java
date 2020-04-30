package com.guide.c3;

/**
 * In the following fragment, after the break statement executes, what is displayed?
 */
public class SelfTest7 {
    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i < 10; i++) {
            while (true) {
                if (i < x) break;
            }
            System.out.println("after while");
        }
        System.out.println("after for");
    }
}
