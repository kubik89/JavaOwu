package lection3.homeWork;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1, "JLP", 50);
        Book book2 = new Book(2, "NewJersey", 70);
        Book book3 = new Book(3, "NYSP", 100);
        Magazine magazine1 = new Magazine(1, "VB", 25);
        Magazine magazine2 = new Magazine(2, "MCh", 15);
        Magazine magazine3 = new Magazine(3, "I love Lviv", 20);


        Printable[] printables = new Printable[]{book1, book2, book3, magazine1, magazine2, magazine3};

        for (Printable printable : printables) {
            printable.print();
            if (printable instanceof Book) {
                Book.printBooks(((Book) printable).getName());
            } else {
                Magazine.printMagazine(((Magazine) printable).getName());
            }
        }
    }
}
