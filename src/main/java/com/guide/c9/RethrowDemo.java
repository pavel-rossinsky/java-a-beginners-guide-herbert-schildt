package com.guide.c9;

public class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.getException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // recatch exception
            System.out.println("Fatal error - program terminated.");
        }
    }
}
