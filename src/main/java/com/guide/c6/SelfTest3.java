package com.guide.c6;

// Test a Stack
public class SelfTest3 {
    public static void main(String[] args) {
        Stack myStack = new Stack(11);

        String greet = "Hello Java World!";
        for (int i = 0; i < greet.length(); i++) {
            myStack.put(greet.charAt(i));
        }

        char c;
        do {
            c = myStack.pop();
        } while (c != 0);
    }
}
