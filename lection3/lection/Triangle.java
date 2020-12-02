package lection3.lection;

public class Triangle extends GeometricFuigure{

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public int calculatePerimetr() {
        return a + b + c;
    }

    @Override
    public double calculateSquare() {
        return 0.5 * a * b;
    }

    @Override
    public void paint() {
        System.out.println("Triangle is painted");
    }

    @Override
    public void method() {

    }
}
