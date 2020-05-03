package com.guide.c6;

// Return a String object.
public class ErrorMsg {
    String[] msgs = {
            "Output Error",
            "InputError",
            "Disk Full",
            "Index Out-Of-Bounds"
    };

    // Return the error message.
    String getErrorMsg(int i) {
        if (i >= 0 && i < msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}
