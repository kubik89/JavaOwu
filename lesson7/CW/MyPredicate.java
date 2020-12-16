package lesson7.CW;

import lection5.practicTask.Person;

@FunctionalInterface
public interface MyPredicate {

    boolean test (Person person);
}
