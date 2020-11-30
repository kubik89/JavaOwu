package lesson1dz;

public class User {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    public User() {

    }

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public String toString() {
        return id+", " + age+", " + name + ", " + surname+", " + weight + ", " + height + ", ";
    }
}
