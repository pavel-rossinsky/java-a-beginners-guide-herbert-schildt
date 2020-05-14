package com.guide.c8;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos2 twoOb = new ByTwos2();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next ByTwos2 value is " + ob.getNext());

            ob = threeOb;
            System.out.println("Next ByThrees value is " + ob.getNext());
        }
    }
}
