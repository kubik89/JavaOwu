package lesson7.HW;

import java.util.*;
import java.util.stream.Collectors;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private List<Book> book;

    public Person(int id, String name, int age, List<Book> book) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", book=" + book +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return 0;
    }
}
