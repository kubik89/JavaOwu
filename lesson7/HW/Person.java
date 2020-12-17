package lesson7.HW;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private Book book;


    public Person(int id, String name, int age, Book book) {
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

    public Book getBook() {
        return book;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
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
        if (compareId != 0) {
            return compareId;
        } else return compareName;
    }
}
