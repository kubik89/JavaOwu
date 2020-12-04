package lection4.homeWork;

public class Dress extends Shoes implements WomanShoes{
    public Dress(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void takeShoeforWomen() {

    }
}
