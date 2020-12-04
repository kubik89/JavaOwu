package lection4.classWork;

public class Main {
    public static void main(String[] args) {

        for (CarType value : CarType.values()) {
            System.out.println(value);
            System.out.println(value.getUkrTranslation());
            value.paint();
        }

        Engine engine1 = new Engine(2, 4);
        Car car1 = new Car(engine1, "Audi", 32000, CarType.SEDAN);
        Car car2 = new Car(new Engine(3, 8), "Mercedes", 35000, CarType.UNIVERSAL);
        Car car3 = new Car(car1.getEngine(), "VW", 25000, CarType.HATCHBACK);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.getEngine().setCylinderQty(9);
        System.out.println(car1.getEngine().getCylinderQty());

        car1.getEngine().startEngine();
        car1.startCar();

        User <String> u1 = new User<>("1");
        System.out.println(u1.getId());

        User <Integer> u2 = new User<>(2);
        System.out.println(u2.getId());

        User u3 = new User<>("");
        System.out.println(u3);

    }
}
