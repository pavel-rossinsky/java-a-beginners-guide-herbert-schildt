package com.guide.c6;

// Demonstrate the fail-soft array.
public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // show quiet failures
        System.out.println("Fail quietly.");
        for (int i = 0; i < fs.length * 2; i++)
            fs.put(i, i*10);

        for (int i = 0; i < fs.length * 2; i++){
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println();

        // now, handle failures
        System.out.println("\nFail with error reports.");
        for (int i = 0; i < fs.length * 2; i++)
            if (!fs.put(i, i*10))
                System.out.println("Index " + i + " out-of-bounds");

        for (int i = 0; i < fs.length * 2; i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else System.out.println("Index " + i + " out-of-bounds");
        }
    }
}
