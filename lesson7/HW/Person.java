package lesson7.HW;

import java.util.*;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private Set<Book> book = new TreeSet<>();

    List<Person> personList = new ArrayList<>();

    Map<Person, Integer> mapList = new HashMap<>();
    Map<Integer, Book> books = new HashMap();


    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public Set<Book> getBook() {
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

    public void addPersonToList(Person person) {
        personList.add(person);
    }

    public void addBookForPerson(Book book, Person person) {
        for (Person person1 : personList) {
            if (person1.getId() == person.getId()) {
//                System.out.println("Йому додати книжку" + person.getId());
                person1.getBook().add(book);
            }
        }
//        System.out.println(personList);
    }

    public void addAllToMap() {
        for (Person person : personList) {
            int pages = 0;
            for (Book book1 : person.getBook()) {
                pages += book1.getPages();
                mapList.put(person, pages);
            }
        }
        for (Map.Entry<Person, Integer> personIntegerEntry : mapList.entrySet()) {
            System.out.println(personIntegerEntry);
        }
    }

    @Override
    public int compareTo(Person person) {
        return 0;
    }
}
