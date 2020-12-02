package lection3.lection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(2, 3, 5);
        Triangle triangle2 = new Triangle(5, 7, 11);

        Square sq1 = new Square(5);
        Square sq2 = new Square(9);

//        Triangle[] triangles = new Triangle[] {triangle1, triangle2};
//        Square[] squares = new Square[] {sq1, sq2};

        List<GeometricFuigure> fuigures = new ArrayList<>();
        fuigures.add(triangle1);
        fuigures.add(triangle2);
        fuigures.add(sq1);
        fuigures.add(sq2);

//        System.out.println(fuigures);

        int todalSquare = 0;
        for (GeometricFuigure fuigure : fuigures) {
            todalSquare += fuigure.calculateSquare();
            fuigure.paint();
        }
            System.out.println(todalSquare);
    }
}
