package lection6.CW;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


    public Person(int id, String name, int age, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

//    @Override
//    public int compareTo(Person person) {
//        if (this.id > person.getId()) {
//            System.out.println("Більше");
//            return 1;
//        } else if (this.id < person.getId()) {
//            System.out.println("Менше");
//            return -1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Person person) {
        int compareId = this.getId() - person.getId();
        int compareName = this.getName().compareTo(person.getName());
        int compareBirthday = this.getBirthday().compareTo(person.getBirthday());
        if (compareId != 0) {
            return compareId;
        } else if (compareName != 0) {
            return compareName;
        } else return compareBirthday;
    }
}
