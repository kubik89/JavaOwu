package lection4.homeWork;

public class Main {
    public static void main(String[] args) {
        Shoes shoes1 = new Shoes(Size.S, 30, "silver");
        Atelier atel1 = new Atelier(shoes1);

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

    }
}
