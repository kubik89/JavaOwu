package lection4.homeWork;

public class Atelier {

    private Shoes shoes;

    public Atelier() {}

    public Atelier(Shoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "shoes=" + shoes +
                '}';
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void getManShoes() {
        System.out.println("Це чоловічий");
    }

    public void getWomanShoes() {
        System.out.println("Це жіночий одяг");

    }
}
