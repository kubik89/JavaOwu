package lesson2Practic;

public class Cinderella {
    private String name;
    private int age;
    private int footSize;

    public Cinderella(String name, int age, int footSize) {
        this.name = name;
        this.age = age;
        this.footSize = footSize;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getFootSize() {
        return footSize;
    }

    public String toString() {
        return getName() + ", " + getAge() + ", " + getFootSize();
    }
}
