package com.guide.c2;

// Side effects can be important.
public class SideEffects {
    public static void main(String[] args) {
        int i;

        i = 0;

        // Here, i is still incremented even though the if statement fails.
        if (false & (++i < 100))
            System.out.print("if statement executed: " + i);

        // In this case, i is not incremented because the short-circuit operator skips the increment.
        if (false && (++i < 100))
            System.out.print("this won't be executed");
        System.out.print("if statement executed: " + i);
    }
}
