package com.guide.c6;

// Create a Stack
public class Stack {
    private char[] q; // this array holds the stack
    private int loc; // the put and pop index

    // Construct a Stack
    Stack(int size) {
        q = new char[size]; // allocate memory for stack
        loc = size;

    }

    void put(char ch) {
        if (loc == 0) {
            System.out.println(" - Stack is full.");
            return;
        }

        System.out.println(" - put " + ch);

        q[--loc] = ch;
    }

    char pop() {
        if (loc == q.length) {
            System.out.println(" - Stack is empty.");
            return (char) 0;
        }

        char ch = q[loc++];

        System.out.println(" - pop " + ch);

        return ch;
    }
}
