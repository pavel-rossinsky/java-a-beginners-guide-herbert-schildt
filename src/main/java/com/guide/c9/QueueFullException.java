package com.guide.c9;

// An exception for queue-full errors.
public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nQueue us full. Maximum size is " + size;
    }
}
