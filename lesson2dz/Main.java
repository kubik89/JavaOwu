package lesson2dz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal[] animal11 = new Animal[9];
        animal11[0] = new Dog(true, "dry food OpteMeal", "Lviv", "Basrik");
        animal11[1] = new Dog(true, "dry food Sweety", "Kyiv", "Topik");
        animal11[2] = new Dog(true, "dry food MyKorm", "Stryi", "Jack");
        animal11[3] = new Cat(true, "dry food KittyCat", "Mykolaiv", "Ryzhyk");
        animal11[4] = new Cat(true, "Milk", "Drohobych", "Meteor");
        animal11[5] = new Cat(true, "mouse", "Odesa", "Milash");
        animal11[6] = new Horse(true, "grass", "Zhmerynka", "Biljash");
        animal11[7] = new Horse(true, "Water", "Kharkiv", "Strybun");
        animal11[8] = new Horse(true, "Chips", "Poltava", "Kaplia");
        Veterinary v1 = new Veterinary();

        for (int i = 0; i < animal11.length; i++) {
            System.out.println("Прийом тварини № " + i);
            v1.treatAnimal(animal11[i]);
        }
    }
}
