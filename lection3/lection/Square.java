package lection3.lection;

public class Square extends GeometricFuigure{

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int calculatePerimetr() {
        return a * 4;
    }

    @Override
    public double calculateSquare() {
        return a * a;
    }

    @Override
    public void paint() {
        System.out.println("Square is painted");
    }

    @Override
    public void method() {

    }
}
