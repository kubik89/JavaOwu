package lection3.practice;

public class Guitar implements Instrument{

    private int qtyСhord;

    public Guitar (int qtyСhord) {
        this.qtyСhord = qtyСhord;
    }

    @Override
    public void play() {
        System.out.println("Іграє інструмент Гітара, в якої кількість струн " + qtyСhord);
    }
}
