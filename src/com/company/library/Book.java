package com.company.library;

import java.util.Objects;

public class Book {
    private final String bookTitle;
    private final String author;
    private final int bookId;

    public Book(String bookTitle, String author, int bookId) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getBookId() {
        return bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookId != book.bookId) return false;
        if (!Objects.equals(bookTitle, book.bookTitle)) return false;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        int result = bookTitle != null ? bookTitle.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + bookId;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}
