package com.guide.c6;

// Demonstrate the Queue2 class.
public class QDemo2 {
    public static void main(String[] args) {
        // construct 10 element empty queue
        Queue2 q1 = new Queue2(10);

        char[] name = {'T', 'o', 'm'};
        // construct queue from array
        Queue2 q2 = new Queue2(name);

        char ch;
        int i;

        // put some characters into q1
        for (i = 0; i < 10; i++)
            q1.put((char) ('A' + i));

        // construct queue from another queue
        Queue2 q3 = new Queue2(q1);

        // Show the queues.
        System.out.print("Contents of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
