package lection4.homeWork;

public class TShirt extends Shoes implements MenShoes, WomanShoes{
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void takeShoeforMen() {

    }

    @Override
    public void takeShoeforWomen() {

    }
}
