package lesson2dz;

public class Horse extends Animal {
    private boolean canEatGrass;

    public Horse (boolean canEatGrass, String food, String location, String name) {
        super(food, location, name);
        this.food=food;
        this.location = location;
        this.name = name;
        this.canEatGrass = canEatGrass;
    }

    public boolean isCanEatGrass() {
        return canEatGrass;
    }

    public void makeNoise() {
        System.out.println("Кінь спить");
    }

    public void eat() {
        System.out.println("Кінь їсть");
    }
}
