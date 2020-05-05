package com.guide.c6;

// Return a programmer-defined object.
public class ErrorInfo {
    String[] msgs = {
        "Output Error",
        "InputError",
        "Disk Full",
        "Index Out-Of-Bounds"
    };
    int[] howbad = { 3, 3, 2, 4 };

    Err getErrorInfo(int i) {
        if (i >= 0 && i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Invalid Error Code", 0);
    }
}
