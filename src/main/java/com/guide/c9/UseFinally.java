package com.guide.c9;

// Use finally.
public class UseFinally {
    public static void genException(int what) {
        int t;
        int[] nums = new int[2];

        System.out.println("Receiving " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; // generate div-by-zero error
                    break;
                case 1:
                    nums[4] = 4; // generate array index error
                    break;
                case 2:
                    return; // return from try block
            }
        } catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Can't divide by Zero!");
            return; // return from catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching elements found.");
        } finally {
            System.out.println("Leaving try.");
        }
    }
}
