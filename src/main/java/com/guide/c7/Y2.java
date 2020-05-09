package com.guide.c7;

class Y2 extends X2 {
    public static void main(String[] args) {
        System.out.println("Hello, I'm Y2 class!");
    }
    int b;

    Y2(int i, int j) {
        super(j);
        b = i;
    }
}
