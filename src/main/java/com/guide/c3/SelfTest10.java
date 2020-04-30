package com.guide.c3;

/**
 * Write a program that reads characters from the keyboard and coverts all lowercase letters to uppercase,
 * and all uppercase letters to lowercase, displaying the result.
 * Have the program stop when the user enters a period.
 * At the end, have the program display the number of case changes that have taken place.
 */
public class SelfTest10 {
    public static void main(String[] args)
        throws java.io.IOException {
        char c;
        int changes = 0;

        do {
            c = (char) System.in.read();

            if (c >= 'a' && c <= 'z') {
                c -= 32;
                changes++;
            } else if (c >= 'A' && c <= 'Z') {
                c += 32;
                changes++;
            }

            System.out.print(c);
        } while (c != '.');

        System.out.print("Total changes: " + changes);
    }
}
