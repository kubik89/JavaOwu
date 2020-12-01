package lesson2Practic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Prince man1 = new Prince(39);
        Cinderella cin1 = new Cinderella("Svitlana", 30, 39);
        Cinderella cin2 = new Cinderella("Olha", 29, 38);
        Cinderella cin3 = new Cinderella("Roksolana", 28, 37);
        Cinderella cin4 = new Cinderella("Halyna", 27, 36);
        Cinderella cin5 = new Cinderella("Inna", 26, 35);
        man1.setShoesSize(36);

        ArrayList<Cinderella> cinderellas = new ArrayList<>();
        cinderellas.add(cin1);
        cinderellas.add(cin2);
        cinderellas.add(cin3);
        cinderellas.add(cin4);
        cinderellas.add(cin5);

        for (int i = 0; i < cinderellas.size(); i++) {
            if (cinderellas.get(i).getFootSize() == man1.getShoesSize()) {
                System.out.println("З принцом повинна бути Попелюшка за іменем " + cinderellas.get(i).getName());
            }
        }
    }
}
