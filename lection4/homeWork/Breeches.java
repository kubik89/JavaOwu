package lection4.homeWork;

public class Breeches extends Shoes implements MenShoes, WomanShoes{


    public Breeches(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void takeShoeforMen() {

    }

    @Override
    public void takeShoeforWomen() {

    }
}
