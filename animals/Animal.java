package animals;

public class Animal {
    int id;
    String name;
    int age;
    String type;
    int height;

    public Animal() {

    }

    public Animal(int id, String name, int age, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Animal(int id, String name, int age, int height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
        System.out.println("Id was changed");
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void myName () {
        System.out.println("My name is " + this.name);
    }

    public void canSpeak () {
        System.out.println("I can speak as an animal");
    }

    public void canSpeak (String saySomething) {
        System.out.println("I say the next: " + saySomething);
    }

    public void checkDaysILeave() {
        int myDays = this.age * 365;
        System.out.println("I leave " + myDays + " days");
    }
    public int daysILeave () {
        return this.age * 365;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", height=" + height +
                '}';
    }
}
