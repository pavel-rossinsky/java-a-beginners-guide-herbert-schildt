package com.guide.c8;

// An enhanced version of Series that includes a default method called getNextArray().
public interface Series2 {
    int getNext(); // return next number in series

    default int[] getNextArray(int n) {
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) {
            vals[i] = getNext();
        }

        return vals;
    };

    void reset(); // restart
    void setStart(int x); // set starting value
}
