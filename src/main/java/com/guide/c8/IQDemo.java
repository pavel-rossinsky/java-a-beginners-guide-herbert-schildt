package com.guide.c8;

// Demonstrate the ICharQ interface.
public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;
        iQ = q1;
        // Put some characters into fixed queue.
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Show the queue.
        System.out.print("Contents of fixed queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q2;
        // Put some characters into dynamic queue.
        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));

        // Show the queue.
        System.out.print("Contents of dynamic queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        iQ = q3;
        // Put some characters into circular queue.
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        // Show the queue.
        System.out.print("Contents of circular queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();

        // Put some characters into circular queue.
        for (i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

        // Show the queue.
        System.out.print("Contents of circular queue: ");
        for (i = 0; i < 10; i++) {
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println("\nStore and consume from circular queue.");

        // Store in and consume from circular queue.
        for (i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            System.out.print(ch);
        }

        System.out.println();
    }
}
