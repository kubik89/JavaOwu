package lesson7.HW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Volodymyr", 30, new Book("Book1", 25)));
        personList.add(new Person(2, "Ihor", 21, new Book("Book2", 50)));
        personList.add(new Person(3, "Iryna", 18, new Book("Book3", 65)));
        personList.add(new Person(4, "Olha", 25, new Book("Book4", 57)));
        personList.add(new Person(5, "Oleksiy", 51, new Book("Book5", 120)));
        personList.add(new Person(6, "Andriy", 75, new Book("Book6", 70)));


    }
}
