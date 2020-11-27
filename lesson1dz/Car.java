package lesson1dz;

public class Car {
    String producer;
    String model;
    int power;
    double engine;
    int year;
    int price;

    public Car () {
    }

    public Car (int power, double engine) {
    }

    public Car (String producer, String model, int power, double engine, int year, int price) {
        this.producer = producer;
        this.model = model;
        this.power = power;
        this.engine = engine;
        this.year = year;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", engine=" + engine +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    //    public String toString() {
//        return producer + ", " + model + ", " + power + ", " + engine + ", " + year + ", " + price;
//    }
}
