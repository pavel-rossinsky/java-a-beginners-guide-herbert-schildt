package com.guide.c8.bookpack;

// A short package demonstration.
public class Book2 {
    private String title;
    private String author;
    private int pubDate;

    public Book2(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}
