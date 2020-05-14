package com.guide.c8.bookpackext;

// Use the Book2 class from bookpack.
public class UseBook {
    public static void main(String[] args) {
        com.guide.c8.bookpack.Book2[] books = new com.guide.c8.bookpack.Book2[5];

        books[0] = new com.guide.c8.bookpack.Book2("Java: A Beginner's Guide", "Schildt", 2018);
        books[1] = new com.guide.c8.bookpack.Book2("Java: The Complete Reference", "Schildt", 2018);
        books[2] = new com.guide.c8.bookpack.Book2("Introducing JavaFX 8 Programming", "Schildt", 2015);
        books[3] = new com.guide.c8.bookpack.Book2("Red Storm Rising", "Clancy", 1986);
        books[4] = new com.guide.c8.bookpack.Book2("On the Road", "Kerouac", 1955);

        for (com.guide.c8.bookpack.Book2 x: books) {
            x.show();
        }
    }
}
