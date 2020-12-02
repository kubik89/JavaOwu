package lection3.homeWork;

import java.awt.*;

public class Magazine implements Printable{

    int id;
    String name;
    int pagesQty;

    public Magazine(int id, String name, int pagesQty) {
        this.id = id;
        this.name = name;
        this.pagesQty = pagesQty;
    }

    public String getName() {
        return name;
    }

    public static void printMagazine(String name) {
        System.out.println("Magazine name: " + name);
    }

    @Override
    public void print() {
        System.out.println("The magazine was printed");
    }

    @Override
    public void printable() {
        System.out.println("Magazine name: " + name);
    }
}
