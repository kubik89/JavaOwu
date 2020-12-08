package lection3.practice;

public interface Instrument {

    String key ="До мажор";

    default void play() {
        System.out.println("Ігра невідомий інструмент");
    };
}
