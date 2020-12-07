package lection4.homeWork;

public abstract class Shoes {

    private Size size;
    private int price;
    private String color;

    public Shoes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
