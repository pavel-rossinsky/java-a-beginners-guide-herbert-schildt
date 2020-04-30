package com.guide.c3;

// Read input until a q us received.
public class Break2 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        for ( ; ; ) {
            ch = (char) System.in.read(); // get a char
            System.out.println("How often do you read?!");

            if (ch == 'q') break;
        }
        System.out.println("You pressed q!");
    }
}
