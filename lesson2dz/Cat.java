package lesson2dz;

public class Cat extends Animal {
    boolean sayMiau;

    public Cat () {}

    public Cat (boolean sayMiau, String food, String location, String name) {
        super(food, location, name);
        this.food=food;
        this.location = location;
        this.name = name;
        this.sayMiau = sayMiau;
    }



    public void makeNoise() {
        System.out.println("Кішка спить");
    }
}
