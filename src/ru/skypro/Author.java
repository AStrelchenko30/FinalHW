package ru.skypro;

public class Author {
    public String name;


    public Author(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Автор: " + name;
    }


}


