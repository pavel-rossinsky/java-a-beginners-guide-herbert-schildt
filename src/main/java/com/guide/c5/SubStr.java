package com.guide.c5;

// Use substring().
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the Web move.";

        String substr = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
