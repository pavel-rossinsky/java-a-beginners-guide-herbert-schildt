package com.guide.c5;

// Demonstrate a two-dimensional array
public class TwoD {
    public static void main(String[] args) {
        int t, i;
        int[][] table = new int[3][4];

        for (t = 0; t < 3; t++) {
            for (i = 0; i < 4; i++) {
                table[t][i] = (t*4) + i + 1;
                System.out.println(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}
