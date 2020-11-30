package lesson2dz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal[] animal = new Animal[9];
        animal[0] = new Dog(true, "dry food OpteMeal", "Lviv", "Basrik");
        animal[1] = new Dog(true, "dry food Sweety", "Kyiv", "Topik");
        animal[2] = new Dog(true, "dry food MyKorm", "Stryi", "Jack");
        animal[3] = new Cat(true, "dry food KittyCat", "Mykolaiv", "Ryzhyk");
        animal[4] = new Cat(true, "Milk", "Drohobych", "Meteor");
        animal[5] = new Cat(true, "mouse", "Odesa", "Milash");
        animal[6] = new Horse(true, "grass", "Zhmerynka", "Biljash");
        animal[7] = new Horse(true, "Water", "Kharkiv", "Strybun");
        animal[8] = new Horse(true, "Chips", "Poltava", "Kaplia");
        Veterinary v1 = new Veterinary();

        for (int i = 0; i < animal.length; i++) {
            System.out.println("Прийом тварини № " + i);
            v1.treatAnimal(animal[i].name, animal[i].food, animal[i].location);
        }
    }
}
