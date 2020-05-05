package com.guide.c6;

// This program contains an error and will not compile!
// Compilation error: reference to vaTest is ambiguous
public class VarArgs4 {
    // Use an int vararg parameter.
    static void vaTest(int ... v) {

    }

    // Use a boolean vararg parameter.
    static void vaTest(boolean ... v) {

    }

    public static void main(String[] args) {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK

//         vaTest(); // Ambiguous!
    }
}
