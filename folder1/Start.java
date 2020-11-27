package folder1;

import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
//        User u1 = new User();
//        u1.id = 1;
//        u1.login = "vbodnar";
//        u1.age = 30;
//        u1.height = 180;
//        u1.sex = "man";
//        u1.isActive = true;
//        u1.weight = 90;
//        u1.specialSymbol = '#';
//
//        User u2 = new User(2,"tester","2222", (byte) 21, "man", 180.1F, 90.5, true,'*');
//        User user3 = new User(3, "user3", (byte) 20);
//        System.out.println(u1);
//        System.out.println(u2);
//        System.out.println(user3);
//
//        u1.setId(10);
//        System.out.println(u1.getId());
//        System.out.println(u1);
//        System.out.println(u1.greetings("sdsds"));
//
//        String[] skill1 = {"html", "css", "js"};
//        Dev dev1 = new Dev("Vova", skill1);
//        Dev dev2 = new Dev("Vova", new String[]{"Angular", "React"});
//        System.out.println(dev1);
//        System.out.println(dev2);

        ArrayList<String> skills = new ArrayList<>();
        skills.add("Python");
        skills.add("Java");
        skills.add("JS");
        Developer dev3 = new Developer("Vasya", skills);
        System.out.println(dev3);

        String s0 = skills.get(0);
        String s1 = skills.get(1);
        System.out.println(s0 + ", " + s1);

        int[] ints1 = {11, 22, 33};
        for (int i = 0; i < ints1.length; i++) {
            System.out.println(ints1[i]);
        }
        int[] ints2 = {10, 20, 30};
        for (int i : ints2) {
            System.out.println(i);
        }
        dev3.work();
        dev3.work("you need to get money");
        dev3.work(1000);

        SuperDev supDev1 = new SuperDev("SupDev");
        supDev1.work(15);
        String name = supDev1.getMyName();
        System.out.println(name);
    }
}
