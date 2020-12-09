package lection5.ClassWork;

import lection3.homeWork.Printable;

import java.util.Objects;

public class Book {

    int id;
    String name;
    int pagesQty;

    public Book(int id, String name, int pageQty) {
        this.id = id;
        this.name = name;
        this.pagesQty = pageQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                pagesQty == book.pagesQty &&
                Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pagesQty);
    }

    public static void printBooks(String name) {
        System.out.println("Book name: " + name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pagesQty=" + pagesQty +
                '}';
    }
}
