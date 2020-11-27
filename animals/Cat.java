package animals;

public class Cat extends Animal {
    boolean sayMiau;
    boolean sayAsCat;

    public Cat () {}

    public Cat (boolean sayMiau, boolean sayAsCat) {
        this.sayMiau = sayMiau;
        this.sayAsCat = sayAsCat;
    }

    public Cat(int id, String name, int age, String type, boolean sayMiau, boolean sayAsCat) {
        super(id, name, age, type);
        this.sayMiau = sayMiau;
        this.sayAsCat = sayAsCat;
    }

    public boolean getSayMiau () {
        return sayMiau;
    }

    public boolean setSayMiau (boolean sayMiau) {
        if (sayMiau) {
            this.sayAsCat = true;
            this.type = "cat";
        }
        return sayAsCat = false;
    }

    public void sayMiau () {
        System.out.println("Miaaaa-uu");
    }

    public void setSayMiau1 () {
        if (this.type.equals("cat")) {
            System.out.println("I'm a cat.");
        }
        else
            System.out.println("I'm not a cat");
    }


}
