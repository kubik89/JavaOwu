package lection3.lection;

public interface Paintable {

    int AAA = 4;

    void paint();

    default void method() {
        System.out.println("Default method");
    }
}
