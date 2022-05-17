package ru.skypro;

import java.util.Objects;

public class Book {
    private String bookName;
    private int publisherYear;


    public Book(String bookName, Author author, int publisherYear) {
        this.bookName = bookName;
        this.publisherYear = publisherYear;
        this.author = author;
    }

    private final Author author;

    public String getBookName() {
        return bookName;
    }

    public int getPublisherYear() {

        return publisherYear;
    }

    public void setCorrectYear(int year) {

        this.publisherYear = year;
    }

    @Override
    public String toString() {
        return "Название книги:" + bookName + " , " + author + " , " + "Год издания: " + publisherYear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && bookName.equals(book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publisherYear, author);
    }
}