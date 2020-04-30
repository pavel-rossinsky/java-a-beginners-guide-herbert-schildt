package com.guide.c3;

// Guess the letter game, 4th version.
public class Guess4 {
    public static void main(String[] args)
    throws java.io.IOException {

        char ch, ignore, answer = 'K';

        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.print("Can you guess it: ");

            // read a character
            ch = (char) System.in.read();

            // discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Right **");
            else {
                System.out.println("...Sorry, you're ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try again!\n");
            }
        } while (answer != ch);
    }
}
