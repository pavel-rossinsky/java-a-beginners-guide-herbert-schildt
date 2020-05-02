package com.guide.c5;

// Display all command-line information.
public class CLDemo {
    public static void main(String[] args) {
        System.out.println("There are " + args.length + " command-line arguments.");

        System.out.println("They are: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
