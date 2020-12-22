package lesson8.HW;

public class ZooClub {
    String name;
    int age;
    String color;

    public ZooClub(){};

    public ZooClub(String name) {
        this.name = name;
    }

    public ZooClub(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ZooClub(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return "ZooClub{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
