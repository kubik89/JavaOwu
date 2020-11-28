package lesson2dz;

public class Animal {
    String name;
    String food;
    String location;

    public Animal() {
    }

    public Animal(String name, String food, String location) {
    }

    public void makeNoise() {

        System.out.println("Тварина видає голос");
    }

    public void eat() {
        System.out.println("Тварина їсть");
    }

    public void sleep() {
        System.out.println("Тварина спить");
    }

}
