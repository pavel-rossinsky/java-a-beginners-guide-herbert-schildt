package com.guide.c6;

// Objects can be passed to methods.
public class Block {
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Return true if ob defines same block.
    boolean sameBlock(Block ob) {
        return ob.a == a && ob.b == b && ob.c == c;
    }

    // Return true if ob has same volume.
    boolean sameVolume(Block ob) {
        return ob.volume == volume;
    }
}
