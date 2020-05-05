package com.guide.c6;

// Create a Stack
public class Stack {
    private char[] q; // this array holds the stack
    private int putloc, getloc; // the put and get indices

    // Construct a Stack
    Stack(int size) {
        q = new char[size]; // allocate memory for stack
        getloc = putloc = size;

    }

    void put(char ch) {
        if (putloc == 0) {
            System.out.println(" - Stack is full.");
            return;
        }

        System.out.println(" - put " + ch);

        q[--putloc] = ch;
        getloc = putloc;
    }

    char pop() {
        if (getloc == q.length) {
            System.out.println(" - Stack is empty.");
            return (char) 0;
        }

        char ch = q[getloc++];

        System.out.println(" - pop " + ch);

        return ch;
    }
}
