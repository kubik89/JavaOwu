package lesson8.HW;

public class MyZooClub {
    String name;
    int age;
    String color;

    public MyZooClub(){};

    public MyZooClub(String name) {
        this.name = name;
    }

    public MyZooClub(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MyZooClub(String name, int age, String color) {
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
