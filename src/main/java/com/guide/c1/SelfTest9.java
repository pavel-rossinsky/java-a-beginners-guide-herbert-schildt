package com.guide.c1;

/**
 * Calculates effective weight on the Moon of a man of 80kg.
 */
class SelfTest9 {
    public static void main(String[] args) {
        double gravityCoefficient = 0.17;

        double effectiveWeight = 80 * gravityCoefficient;

        System.out.println("Effective weight on the Moon: " + effectiveWeight);
    }
}