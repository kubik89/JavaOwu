package lesson7.HW;

import java.util.*;
import java.util.stream.Collectors;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private List<Book> book = new ArrayList<>();

//    List<Person> personList = new ArrayList<>();
//
//    Map<Person, Integer> mapList = new HashMap<>();
//    Map<String, Book> mapStringBook = new HashMap();
//    List<Book> bookList = new ArrayList<>();


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

//    public void addPersonToList(Person person) {
//        personList.add(person);
//    }
//
//    public void addBookForPerson(Book book, Person person) {
//        for (Person person1 : personList) {
//            if (person1.getId() == person.getId()) {
//                person1.getBook().add(book);
//            }
//        }
//    }
//
//    public void generateMapPersonInteger() {
//        for (Person person : personList) {
//            int pages = 0;
//            for (Book book1 : person.getBook()) {
//                pages += book1.getPages();
//                mapList.put(person, pages);
//            }
//        }
//        for (Map.Entry<Person, Integer> personIntegerEntry : mapList.entrySet()) {
//            System.out.println(personIntegerEntry);
//        }
//    }
//
//    //    мапу <String, Book>, де String - ім'я людини, Book - книжка з найбільшою кількістю сторінок
//    public void mapStringBook() {
//        for (Person person : personList) {
//            List<Book> pagesArrDemo = new ArrayList<>();
//            for (Book book1 : person.getBook()) {
//                pagesArrDemo.add(book1);
//            }
//            List<Book> collect = pagesArrDemo.stream()
//                    .sorted((integer, t1) -> t1.getPages() - integer.getPages())
//                    .collect(Collectors.toList());
//            mapStringBook.put(person.getName(), collect.get(0));
//        }
//        mapStringBook.forEach((s, book1) -> System.out.println(s + ", " + book1));
//    }
//
////3. згенерувати List<Book> відфільтрувавши тільких тих людей, хто старше 25 років і книжки які мають більше 500 сторінок
//
//    public void filteredListBook() {
//        for (Person person : personList) {
//            if (person.getAge() > 25) {
//                for (Book book1 : person.getBook()) {
//                    if (book1.getPages() > 500) {
//                        bookList.add(book1);
//                    }
//                }
//            }
//        }
//        System.out.println(bookList);
//    }
//
    @Override
    public int compareTo(Person person) {
        return 0;
    }
}
