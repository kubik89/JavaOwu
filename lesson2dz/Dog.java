package lesson2dz;

public class Dog extends Animal {
    boolean sayGavGav;

    public Dog (boolean sayGavGav, String food, String location, String name) {
        super(food, location, name);
        this.food=food;
        this.location = location;
        this.name = name;
    }


    public void makeNoise() {
        System.out.println("Собака спить");
    }
    public void eat() {
        System.out.println("Собака їсть");
    }
}
