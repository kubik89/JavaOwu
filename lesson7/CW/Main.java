package lesson7.CW;

import lection5.practicTask.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Predicate<Person> personPredicate = person1 -> person1.getName().startsWith("V");

//        Predicate<Person> predicate = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getAge()>=20;
//            }
//        };

        Person person = new Person(1, "Vasyl", 30);

//        System.out.println(predicate.test(person)); // це для нормального Predicate
        System.out.println(personPredicate.test(person)); // це для лямбди з Predicate
//-------------
//        Consumer<Person> personConsumer = new Consumer<Person>() {
//            @Override
//            public void accept(Person person) {
//                System.out.println("Consumer - " + person);
//            }
//        };

        Consumer<Person> personConsumer = persCons -> System.out.println(persCons.getName() + " - Name");
        personConsumer.accept(person);
//-------------
        Supplier<Person> personSupplier = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person(2, "Ihor", 15);
            }
        };
        System.out.println("Supplier " + personSupplier.get());

        // повертаємо обєкт Person через Supplier, а потім виводимо його на екран через Consumer
        personConsumer.accept(personSupplier.get());

        Supplier<Person> personSupplier1 = () -> new Person(2, "Ihor", 15);
        personConsumer.accept(personSupplier1.get());
//-------------
        Function<Person, String> stringFunction = new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.getAge() + " : " + person.getName();
            }
        };
        System.out.println(stringFunction.apply(person));

        Function<Person, String> stringFunction1 = allPersons -> {
            String s = allPersons.getName().toUpperCase() + " : " + allPersons.getId();
            return s;
        };
        System.out.println(stringFunction1.apply(person));

        Function<Person, String> stringFunction2 = Person::getName;
        stringFunction2.apply(person);
//-------------
        BiFunction<Person, Integer, Person> personBiFunction = new BiFunction<Person, Integer, Person>() {
            @Override
            public Person apply(Person person, Integer integer) {
                return new Person(3, person.getName(), integer);
            }
        };
        System.out.println(personBiFunction.apply(person, 100));
//-------------
        System.out.println("--- STREAM ---");
        List<Person> list = new ArrayList<>();
        list.add(new Person(3, "Katya", 25));
        list.add(new Person(2, "Vova", 30));
        list.add(new Person(1, "Semen", 60));
        list.add(new Person(4, "Roman", 20));

//       -- виводжу весь ліст на екран
        list.forEach(value -> System.out.println(value));

//       -- створити колекцію імен з ліста
//    Для всього ліста через map виконую getName (він побачить що це String) і додаю в колекцію (в масив).
        List<String> collect = list.stream()
                .map(value -> value.getName())
                .collect(Collectors.toList());
        System.out.println(collect);

//      -- сортувати полекцію по id
        List<Person> collect1 = list.stream()
                .sorted((person1, t1) -> person1.getId() - t1.getId())
                .collect(Collectors.toList());
        System.out.println(collect1);
        collect1.forEach(value -> System.out.println(value));

//        фільтрувати ліст по тих, хто народився в певний рік
        List<Person> collect2 = list.stream().filter(pers -> pers.getAge() >= 23).collect(Collectors.toList());
        System.out.println(collect2);

//        фільтрувати ліст по тих, хто народився в певний рік і повернути їх ID
        List<Integer> personIDlist = list.stream()
                .filter(pers -> pers.getAge() >= 23)
//                .mapToInt(value1 -> value1.getId()) // якщо знаю, що це точно int і треба щось зробити з цими
//                int, то далі будуть доступні методи для int
                .map(valueByID -> valueByID.getId())
                .collect(Collectors.toList());
//        List<Integer> collect4 = collect3.stream().map(value -> value.getId()).collect(Collectors.toList());
        System.out.println(personIDlist);

//        вибрати 3-и перших обєкти і повернути їх у зворотньому порядку
        List<Person> personList = list.stream()
                .limit(3)
                .sorted((person1, t1) -> t1.getAge() - person1.getAge())
                .collect(Collectors.toList());
        System.out.println(personList);

//        знайти середній вік людей і вивести 2 лісти:
//            - старші середнього віку
//            - молодшці середнього віку
        OptionalDouble average = list.stream().mapToInt(person1 -> {
            return LocalDate.now().getYear() - person1.getAge();
        }).average();
        System.out.println(average);

        String s1 = list.stream().map(Person::getName).reduce((s, s2) -> s + " _ " + s2).get();
        System.out.println(s1);

//        // якщо обєкт присутній - повернути його
//        boolean isPresent = Optional.of(new Person(4, "Iryna", 55)).isPresent();

//        // якщо обєкт присутній - вивести його на екран і додати вік (або виконати дію)
//        Optional.of(new Person(4, "Iryna", 55)).ifPresent(person2 -> System.out.println(person.getAge()+7));

//      // якщо обєкт null - то нічого не виведеться, ніби заглушка, щоб не отримати помилку NullPointerException
//        Optional.ofNullable(null).ifPresent(person2 -> System.out.println(person));

//        boolean isPresent = Optional.ofNullable(null).isPresent();
//        System.out.println(isPresent);

//        System.out.println(list.stream().count());
//        System.out.println(list.stream().findFirst().get().getName());

    }
}
