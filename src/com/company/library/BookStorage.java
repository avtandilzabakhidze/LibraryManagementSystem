package com.company.library;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {
    public static Map<Book, Integer> bookList = new HashMap<>();

    public static void addBook(Book book) {
        if (bookList.containsKey(book)) {
            bookList.put(book, bookList.get(book) + 1);
        } else {
            bookList.put(book, 1);
        }
    }

    public static void removeBook(Book book) {
        if (bookList.containsKey(book)) {
            int count = bookList.get(book);
            if (count > 1) {
                bookList.put(book, count - 1);
            } else {
                bookList.remove(book);
            }
        }
    }

    public static void clearStorage() {
        bookList.clear();
    }

    public static int getBookCount(Book book) {
        return bookList.getOrDefault(book, 0);
    }
}
