package lesson2dz;

import dz24112020.Car;

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

        for (int i = 0; i < animal.length; i++) {
            System.out.println("Прийом тварини №" + i);
            System.out.println(
                    "Ім'я - " + animal[i].name +
                    " Знаходження - " + animal[i].location +
                    " Їда - " + animal[i].food
            );

        }


//        Dog dog1 = new Dog(true, "dry food OpteMeal", "Lviv");
//        Dog dog2 = new Dog(true, "dry food Sweety", "Kyiv");
//        Dog dog3 = new Dog(true, "dry food MyKorm", "Stryi");

//        Cat cat1 = new Cat(true, "dry food KittyCat","Mykolaiv");
//        Cat cat2 = new Cat(true, "Milk","Drohobych");
//        Cat cat3 = new Cat(true, "mouse","Odesa");

//        Horse horse1 = new Horse(true, "grass", "Zhmerynka");
//        Horse horse2 = new Horse(true, "Water", "Kharkiv");
//        Horse horse3 = new Horse(true, "Chips", "Poltava");


    }
}
