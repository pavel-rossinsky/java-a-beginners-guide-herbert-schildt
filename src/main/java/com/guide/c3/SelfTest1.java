package com.guide.c3;

/**
 * Write a program that reads characters from the keyboard until a period is received.
 * Have the program count the number of spaces. Report the total at the end of the program.
 */
public class SelfTest1 {
    public static void main(String[] args)
        throws java.io.IOException {

        char c;
        int spaces = 0;

        do {
            c = (char) System.in.read();

            if (c == ' ') {
                spaces++;
            }
        } while (c != '.');

        System.out.println("The number of spaces: " + spaces);
    }
}
