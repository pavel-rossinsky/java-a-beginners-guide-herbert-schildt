package com.guide.c1;

class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;

        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;

            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;

            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}