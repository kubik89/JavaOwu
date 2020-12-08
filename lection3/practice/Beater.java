package lection3.practice;

public class Beater implements Instrument {

    private double size;

    public Beater(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Іграє інструмент Барабан, в якого розмір " + size);
    }
}
