package lesson2dz;

public class Horse extends Animal {
    boolean canEatGrass;

    public Horse () {}

    public Horse (boolean canEatGrass, String food, String location, String name) {
        super(food, location, name);
        this.food=food;
        this.location = location;
        this.name = name;
        this.canEatGrass = canEatGrass;
    }

    public void makeNoise() {
        System.out.println("Кінь спить");
    }
}
