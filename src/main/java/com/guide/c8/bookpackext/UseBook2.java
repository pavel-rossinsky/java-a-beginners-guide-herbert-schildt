package com.guide.c8.bookpackext;

import com.guide.c8.bookpack.*;

// Use the Book2 class from bookpack.
public class UseBook2 {
    public static void main(String[] args) {
        Book3[] books = new Book3[5];

        books[0] = new Book3("Java: A Beginner's Guide", "Schildt", 2018);
        books[1] = new Book3("Java: The Complete Reference", "Schildt", 2018);
        books[2] = new Book3("Introducing JavaFX 8 Programming", "Schildt", 2015);
        books[3] = new Book3("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book3("On the Road", "Kerouac", 1955);

        for (Book3 x: books) {
            x.show();
        }
    }
}
