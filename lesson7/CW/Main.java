package lesson7.CW;

import lection5.practicTask.Person;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Predicate<Person> predicate = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge()>=20;
            }
        };

        Person person = new Person(1, "Vasyl", 30);
        System.out.println(predicate.test(person));

        Consumer<Person> personConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("Consumer - " + person);
            }
        };
        personConsumer.accept(person);

        Supplier<Person> personSupplier = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person(2, "Ihor", 15);
            }
        };
        System.out.println("Supplier " + personSupplier.get());

        // повертаємо обєкт Person через Supplier, а потім виводимо його на екран через Consumer
        personConsumer.accept(personSupplier.get());

        Function<Person, String> stringFunction = new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.getAge() + " : " + person.getName();
            }
        };
        System.out.println(stringFunction.apply(person));

        BiFunction<Person, Integer, Person> personBiFunction = new BiFunction<Person, Integer, Person>() {
            @Override
            public Person apply(Person person, Integer integer) {
                return new Person(3, person.getName(), integer);
            }
        };
        System.out.println(personBiFunction.apply(person, 100));
    }
}
