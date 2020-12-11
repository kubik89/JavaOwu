package lection4.homeWork;

import lection3.homeWork.Printable;
import lesson1dz.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TShirt tshirt1 = new TShirt(Size.M, 100, "yellow");
        TShirt tshirt2 = new TShirt(Size.L, 130, "green");
        TShirt tshirt3 = new TShirt(Size.XS, 110, "blue");

        Breeches breeche1 = new Breeches(Size.S, 300, "black");
        Breeches breeche2 = new Breeches(Size.XXS, 350, "green");
        Breeches breeche3 = new Breeches(Size.S, 300, "blue");

        Cravat cravat1 = new Cravat(Size.L, 100, "orange");
        Cravat cravat2 = new Cravat(Size.M, 150, "purple");
        Cravat cravat3 = new Cravat(Size.XS, 200, "silver");

        Dress dress1 = new Dress(Size.S, 500, "white");
        Dress dress2 = new Dress(Size.M, 650, "light green");
        Dress dress3 = new Dress(Size.L, 900, "cyan");

        Atelier at2 = new Atelier(tshirt2);
        Atelier at3 = new Atelier(tshirt3);

        ArrayList<Atelier> myShoesList = new ArrayList<>();
        myShoesList.add(at2);
        myShoesList.add(at3);
        myShoesList.add(new Atelier(breeche1));
        myShoesList.add(new Atelier(breeche2));
        myShoesList.add(new Atelier(breeche3));
        myShoesList.add(new Atelier(cravat1));
        myShoesList.add(new Atelier(cravat2));
        myShoesList.add(new Atelier(cravat3));
        myShoesList.add(new Atelier(dress1));
        myShoesList.add(new Atelier(dress2));
        myShoesList.add(new Atelier(dress3));


        for (Object shoes : myShoesList) {
            Atelier st = (Atelier) shoes;
            if (st.getShoes() instanceof WomanShoes && st.getShoes() instanceof MenShoes) {
                System.out.println("Цей одяг спільний для чоловіків та жінок");
            } else if (st.getShoes() instanceof WomanShoes) {
                st.getWomanShoes();
                System.out.println(st.getShoes());
                System.out.println("Жіночий");
            } else if (st.getShoes() instanceof MenShoes) {
                st.getManShoes();
                System.out.println(st.getShoes());
                System.out.println("Чоловічий");
            }
        }
    }
}
