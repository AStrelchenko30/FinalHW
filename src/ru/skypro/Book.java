package ru.skypro;

public class Book {
    public String bookName;
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

    public void setNewYear(int Year) {
        this.publisherYear = Year;
    }
    @Override
    public String toString() {
        return "Название книги:" + bookName + " , " + author + " , " + "Год издания: " + publisherYear;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book1 = (Book) other;
        bookName.equals(book1.bookName);
        author.equals(book1.author);
        return bookName.equals(book1.bookName)&&author.equals(book1.author);
    }
    @Override
    public int hashCode() {
        return publisherYear;
    }
    }