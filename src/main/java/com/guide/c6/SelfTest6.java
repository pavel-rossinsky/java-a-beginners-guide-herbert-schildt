package com.guide.c6;

// Write a recursive method that displays a string backwards.
public class SelfTest6 {
    public static void main(String[] args) {
        String s1 = "Hello Java World!";

        readStrBackward(s1, 0);
    }

    public static void readStrBackward(String s, int pos) {
        if (pos != s.length() - 1) readStrBackward(s, pos + 1);

        System.out.println("read: " + s.charAt(pos));
    }
}
