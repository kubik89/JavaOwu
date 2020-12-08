package lection3.practice;

public class Trumpet implements Instrument{

    private double diametr;

    public Trumpet (double diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Іграє інструмент Труба, в якої діаметр " + diametr);
    }
}
