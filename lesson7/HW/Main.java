package lesson7.HW;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Book1", 10);
        Book book2 = new Book("Book2", 750);
        Book book3 = new Book("Book3", 550);
        Book book4 = new Book("Book4", 65);

        Person p1 = new Person(1, "Volodymyr", 30);
        Person p2 = new Person(2, "Ihor", 21);
        Person p3 = new Person(3, "Iryna", 18);
        Person p4 = new Person(4, "Olha", 25);
        Person p5 = new Person(5, "Oleksiy", 51);
        Person p6 = new Person(6, "Andriy", 75);

        p1.addPersonToList(p1);
        p1.addPersonToList(p2);
        p1.addPersonToList(p3);
        p1.addPersonToList(p4);
        p1.addPersonToList(p5);
        p1.addPersonToList(p6);

        p1.addBookForPerson(book1, p1);
        p1.addBookForPerson(book2, p2);
        p1.addBookForPerson(book4, p1);
        p1.addBookForPerson(book1, p3);
        p1.addBookForPerson(book3, p1);
        p1.addBookForPerson(book3, p4);
        p1.addBookForPerson(book2, p5);
        p1.addBookForPerson(book3, p6);
        p1.addBookForPerson(book1, p6);

        p1.generateMapPersonInteger();

        p1.mapStringBook();

        p1.filteredListBook();

    }
}
