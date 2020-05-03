package com.guide.c5;

// Demonstrate ShowBits53.
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits53 b = new ShowBits53(8);
        ShowBits53 i = new ShowBits53(32);
        ShowBits53 li = new ShowBits53(64);

        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n237658768 in binary: ");
        li.show(237658768);

        // you can also show low-order bits of any integer
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}
