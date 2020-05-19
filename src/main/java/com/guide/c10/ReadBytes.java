package com.guide.c10;

import java.io.*;

// Read an array of bytes from the keyboard.
public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];

        System.out.println("Enter some characters.");
        System.in.read(data);
        System.out.println("You entered: ");
        for (int i = 0; i < data.length; i++)
            System.out.print((char) data[i]);
    }
}
