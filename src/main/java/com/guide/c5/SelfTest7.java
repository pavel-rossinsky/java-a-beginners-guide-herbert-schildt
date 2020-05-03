package com.guide.c5;

// Use XOR and an eight-character string to encode and decode a message.
public class SelfTest7 {
    public static void main(String[] args) {
        String msg = "This is a test written by Pavel Rossinsky";
        String encmsg = "";
        String decmsg = "";
        String key = "asdhzqta";

        System.out.print("Original message: ");
        System.out.println(msg);
        System.out.println("its length: " + msg.length());

        // encode the message
        for (int i = 0, j = 0; i < msg.length(); i++, j++) {
            if (j == key.length()) {
                j = 0;
            }
//            System.out.print("Key charAt: " + j + " " + key.charAt(j));
//            System.out.print(" " + msg.charAt(i));
            encmsg += ((char) (msg.charAt(i) ^ key.charAt(j)));
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the message
        for (int i = 0, j = 0; i < encmsg.length(); i++, j++) {
            if (j == key.length()) {
                j = 0;
            }
            decmsg += ((char) (encmsg.charAt(i) ^ key.charAt(j)));
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
