package com.guide.c8;

public interface MyIF2 {
    // this is a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getUserID();

    // This is a default method. Notice that it provides
    // a default implementation.
    default int getAdminID() {
        return 1;
    }

    // This is a static interface method.
    static int getUniversalID() {
        return 0;
    }
}
