package lection3.practice;

public class Main {
    public static void main(String[] args) {
        Beater beater1 = new Beater(50.5);
        Instrument[] instrument = new Instrument[] {
                beater1,
                new Beater(60.8),
                new Guitar(8),
                new Guitar(6),
                new Trumpet(20.1),
                new Trumpet(25.9),
                new Trumpet(30.3),
        };

        for (int i = 0; i < instrument.length; i++) {
            instrument[i].play();
        }
    }
}
