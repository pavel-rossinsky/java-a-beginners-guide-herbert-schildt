package com.guide.c8.bookpackext;

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2018, "Oracle Press");
        books[1] = new ExtBook("Java: The Complete Reference", "Schildt", 2018, "Oracle Press");
        books[2] = new ExtBook("Introducing JavaFX 8 Programming", "Schildt", 2015, "Oracle Press");
        books[3] = new ExtBook("Red Storm Rising", "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

        for (ExtBook x: books) {
            x.show();
        }

        // Find books by author
        System.out.println("Showing all books by Schildt.");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == "Schildt")
                System.out.println(books[i].getTitle());
        }
    }
}
