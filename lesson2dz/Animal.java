package lesson2dz;

public class Animal {
    String name;
    String food;
    String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    @Override
    public String toString() {
        return name + food + location;
    }

    public String getName() {
        return name;
    }

    public String animal1() {
        return
                "Картка пацієнта: \n" +
                        " Ім'я: " + name + "; \n" +
                        " Харчування: " + food + "; \n" +
                        " Місце проживання: " + location;
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
