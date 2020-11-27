package lesson1dz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        1. Створити 10 цілочисленних змінних
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int j = 9;
        int k = 10;
//        - додати їх між собою
        int summAll = a + b + c + d + e + f + g + h + j + k;
//                - відняти їх між собою
        int subtrAll = a - b - c - d - e - f - g - h - j - k;
//                - перемножити їх між собою
        int multiplAll = a * b * c * d * e * f * g * h * j * k;
//                - поділити їх між собою
        double decrAll = (double) a / (double) b / (double) c;
//        Вивести результати в консоль
        System.out.println(summAll);
        System.out.println(subtrAll);
        System.out.println(multiplAll);
        System.out.println(decrAll);

//        2. Придумати речення з 10-12 слів. Кожне слово покласти в змінну. Вивести в консоль
//        ціле речення.
        String w1 = "Hello.";
        String w2 = "My";
        String w3 = "name";
        String w4 = "is";
        String w5 = "Volodymyr";
        String space = " ";
        String sentence = w1 + space + w2 + space + w3 + space + w4 + space + w5;
        System.out.println(sentence);

        //Створити 10 об'єктів класу User.
        User u1 = new User(1, 20, "Volodymyr", "Petrov", 75.2, 175.1);
        User u2 = new User(2, 25, "Ihor", "Zhovnir", 79.1, 168.0);
        User u3 = new User(3, 35, "Oleh", "Zubr", 85.0, 155.6);
        User u4 = new User(4, 41, "Max", "Kalashnikov", 91.7, 180.4);
        User u5 = new User(5, 70, "John", "Berry", 49.2, 150.1);
        User u6 = new User(6, 16, "Zahar", "Pshonka", 55.6, 145.1);


//        Скласти між собою значення їх віку і вивести в консоль.
        int ageResult = u1.age + u2.age + u3.age + u4.age + u5.age + u6.age;
        System.out.println(ageResult);

//        Скласти між собою значення їх ваги і вивести в консоль.
        double weightResult = u1.weight + u2.weight + u3.weight + u4.weight + u5.weight + u6.weight;
        System.out.println(weightResult);

//        Скласти між собою значення їх зросту і вивести в консоль.
        double heightResult = u1.height + u2.height + u3.height + u4.height + u5.height + u6.height;
        System.out.println(heightResult);

//        4. Зробити завдання 3, але 10 об'єктів покласти водин масив.
        User[] user = new User[6];
        user[0] = new User(1, 20, "Volodymyr", "Petrov", 75.2, 175.1);
        user[1] = new User(2, 25, "Ihor", "Zhovnir", 79.1, 168.0);
        user[2] = new User(3, 35, "Oleh", "Zubr", 85.0, 155.6);
        user[3] = new User(5, 70, "John", "Berry", 49.2, 150.1);
        user[4] = new User(6, 16, "Zahar", "Pshonka", 55.6, 145.1);
        user[5] = new User(4, 41, "Max", "Kalashnikov", 91.7, 180.4);

//        Скласти між собою значення їх віку і вивести в консоль.
//        Метод 1
        int countAge = 0;
        for (int i = 0; i < user.length; i++) {
            countAge = user[i].age + countAge;
        }
        System.out.println("вік всіх з допомогою масиву " + countAge);

//        Метод 2
        ArrayList<Integer> ages = new ArrayList<>();
        for (User value : user) {
            ages.add(value.age);
        }
        int newAge = 0;
        for (int i = 0; i < ages.size(); i++) {
            newAge = ages.get(i) + newAge;
        }
        System.out.println("вік всіх з допомогою ArrayList " + newAge);

//        Скласти між собою значення їх ваги і вивести в консоль.

        double countWeight = 0;
        for (User myWeight : user) {
            countWeight += myWeight.weight;
        }
        System.out.println("Вага всіх " + countWeight);

//        Скласти між собою значення їх зросту і вивести в консоль.
        double countHeight = 0;
        for (User myHeight : user) {
            countHeight += myHeight.height;
        }
        System.out.println("Висота всіх " + countHeight);

//        Створити 10 об'єктів класу Car.
        Car[] cars = new Car[5];
        cars[0] = new Car("Mercedes", "s200", 210, 2.4, 2018, 900000);
        cars[1] = new Car("BMW", "X7", 240, 2.6, 2019, 979000);
        cars[2] = new Car("Volvo", "r500", 190, 2.0, 2016, 650200);
        cars[3] = new Car("Daewoo", "Lanos", 110, 1.6, 2016, 300000);
        cars[4] = new Car("Skoda", "Octavia A7", 170, 1.8, 2018, 600000);

//        Скласти між собою значення їх об'ємів і вивести в консоль.
        double countEngine = 0;
        for (int i = 0; i < cars.length; i++) {
            countEngine += cars[i].engine;
        }
        System.out.println("Об'єми всіх двигунів - " + countEngine);

//        Скласти між собою значення їх потужностей і вивести в консоль.

        int countPower = 0;
        for (int i = 0; i < cars.length; i++) {
            countPower += cars[i].power;
        }
        System.out.println("Сума всіх потужностей - " + countPower);

//        7. За допомоги %, спробувати "реверснути" трьохзначне число.
//        Integer.reverse(x);
//        System.out.println(Integer.reverse(x));
//        Варіант 1
        int x = 412;
        int y1 = x % 10;
        int y2 = x % 8;
        int y3 = x % 3;
        System.out.println(y1 + "" + y3 + "" + y2);

//         Варіант 2
//        int x = 412;
//        String strX = Integer.toString(x);
//        String reverse = new java.lang.StringBuilder(strX).reverse().toString();
//        System.out.println(reverse);
    }
}
