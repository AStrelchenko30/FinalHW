package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Author Hemingway = new Author("Эрнест Хемингуэй ");
        Author Fitzgerald = new Author("Фрэнсис Фицджеральд");
        Book book1 = new Book("TheGreatGatsby", Fitzgerald, 1927);
        Book book2 = new Book("AFarewellToArms", Hemingway, 1925);
        Book book3 = new Book("TheGreatGatsby", Fitzgerald, 1927);
        book1.setNewYear(1925);
        System.out.println(book1);
        System.out.println(book1.equals(book3));

    }
}