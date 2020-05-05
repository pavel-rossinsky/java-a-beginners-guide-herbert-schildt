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

        Stack myStack2 = new Stack(4);
        myStack2.put('H');
        myStack2.put('i');
        myStack2.put('!');
        myStack2.pop();
        myStack2.put('?');

        do {
            c = myStack2.pop();
        } while (c != 0);
    }
}
