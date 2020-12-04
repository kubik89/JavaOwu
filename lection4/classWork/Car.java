package lection4.classWork;

public class Car {

    private Engine engine;
    private String brand;
    private int price;
    private CarType carType;

    public Car(Engine engine, String brand, int price, CarType carType) {
        this.engine = engine;
        this.brand = brand;
        this.price = price;
        this.carType = carType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void startCar() {
        this.getEngine().startEngine();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", carType=" + carType +
                '}';
    }
}
