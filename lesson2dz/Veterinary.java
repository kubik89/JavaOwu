package lesson2dz;

public class Veterinary extends Animal {

    public void treatAnimal(String name, String food, String location) {
        System.out.println(
                "Картка пацієнта: \n" +
                " Ім'я: " + name +
                " Харчування: " + food +
                " Місце проживання " + location);
    }
}
