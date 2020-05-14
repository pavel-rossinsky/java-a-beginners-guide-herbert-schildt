package com.guide.c8;

// A further enhanced version of Series that includes two default methods that use a private method called getArray();
public interface Series3 {
    int getNext(); // return next number in series

    // Return an array that contains the next n elements
    // in the series beyond the current element.
    default int[] getNextArray(int n) {
        return getArray(n);
    }

    // Return an array that contains the next n elements
    // in the series, after skipping elements.
    default int[] skipAndGetNextArray(int skip, int n) {
        // Skip the specified number of elements.
        getArray(skip);

        return getArray(n);
    }

    // A private method that returns an array containing the next n elements.
    private int[] getArray(int n) {
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) vals[i] = getNext();
        return vals;
    }

    void reset();
    void setStart(int x); // set starting value
}
