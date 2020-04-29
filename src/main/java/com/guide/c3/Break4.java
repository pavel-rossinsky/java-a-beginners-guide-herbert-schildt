package com.guide.c3;

// Using break with a label.
public class Break4 {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++) {
    one:    {
    two:        {
    three:          {
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        // this is never reached
                        System.out.println("Won't print");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two.");
            }
            System.out.println("After block one.");
        }

        System.out.println("After for.");
    }
}
