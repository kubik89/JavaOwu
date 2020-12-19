package lesson7.HW;

import java.util.*;
import java.util.stream.Collectors;

public class ServicePersonBook {

    List<Person> listPersonAndBooks = new ArrayList<>();

    public List<Person> getListPersonAndBooks() {
        return listPersonAndBooks;
    }

//    1. згенерувати мапу <Person, Integer>, де Integer - кількість сторінок усіх книжок, які має людина
    public void generateMapPersonInteger() {
        Map<Person, Integer> integerMap = new HashMap<>();
        for (Person person : getListPersonAndBooks()) {
            int pages = 0;
            for (Book book1 : person.getBook()) {
                pages += book1.getPages();
                integerMap.put(person, pages);
            }
        }
//        for (Map.Entry<Person, Integer> personIntegerEntry : integerMap.entrySet()) {
//            System.out.println(personIntegerEntry);
//        }
    }

//    2. згенерувати мапу <String, Book>, де String - ім'я людини, Book - книжка з найбільшою кількістю сторінок
    public void mapStringBook() {
        Map<String, Book> stringBookMap = new HashMap<>();
        for (Person person : getListPersonAndBooks()) {
            List<Book> pagesArrDemo = new ArrayList<>();
            for (Book book1 : person.getBook()) {
                pagesArrDemo.add(book1);
            }
            List<Book> collect = pagesArrDemo.stream()
                    .sorted((integer, t1) -> t1.getPages() - integer.getPages())
                    .collect(Collectors.toList());
            stringBookMap.put(person.getName(), collect.get(0));
        }
//        stringBookMap.forEach((s, book1) -> System.out.println(s + ", " + book1));
    }

//    3. згенерувати List<Book> відфільтрувавши тільких тих людей,
//      хто старше 25 років і книжки які мають
//      більше 500 сторінок

    public void filteredListBook() {
        List<Book> bookList = new ArrayList<>();
        for (Person person : getListPersonAndBooks()) {
            if (person.getAge() > 25) {
                for (Book book1 : person.getBook()) {
                    if (book1.getPages() > 500) {
                        bookList.add(book1);
                    }
                }
            }
        }
//        System.out.println(bookList);
    }

    {
        Book book1 = new Book("Book1", 10);
        Book book2 = new Book("Book2", 750);
        Book book3 = new Book("Book3", 550);
        Book book4 = new Book("Book4", 65);
        Book book5 = new Book("Book5", 300);
        Book book6 = new Book("Book6", 860);
        Book book7 = new Book("Book7", 600);

        List<Book> set1 = new ArrayList<>();
        set1.add(book1);
        set1.add(book2);
        List<Book> set2 = Arrays.asList(book2, book3);
        List<Book> set3 = Arrays.asList(book3);
        List<Book> set4 = Arrays.asList(book4, book1);
        List<Book> set5 = Arrays.asList(book5, book6);
        List<Book> set6 = Arrays.asList(book6, book7);

        Person p1 = new Person(1, "Volodymyr", 30, set2);
        Person p2 = new Person(2, "Ihor", 21, set1);
        Person p3 = new Person(3, "Iryna", 18, set3);
        Person p4 = new Person(4, "Olha", 25, set4);
        Person p5 = new Person(5, "Oleksiy", 51, set5);
        Person p6 = new Person(6, "Andriy", 75, set6);

        listPersonAndBooks.add(p1);
        listPersonAndBooks.add(p2);
        listPersonAndBooks.add(p3);
        listPersonAndBooks.add(p4);
        listPersonAndBooks.add(p5);
        listPersonAndBooks.add(p6);
    }
}
