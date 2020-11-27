package animals;

public class Main {
    public static void main(String[] args) {
        Animal an1 = new Animal(1, "Lila", 5, "cat");
        Animal an2 = new Animal(2, "Mila", 6, "cat");
        Animal an3 = new Animal(3, "Barsik", 6, "cat");

//        an3.myName();
//        an3.setId(5);
//        System.out.println(an3.getId());
//        an3.setName("Murzik");
//        String an3Name = an3.getName();
//        System.out.println(an3Name);
//        an3.canSpeak();
//        an3.canSpeak("This is my voice");
//        System.out.println(an3);

        Cat cat1 = new Cat(4,"Jack", 2, "dog", true, true);
        Cat cat2 = new Cat(5,"Brown", 1, "cat", false, true);

        System.out.println(cat1);
        cat1.sayMiau();
        cat1.checkDaysILeave();
        System.out.println(cat1.daysILeave());
        cat1.setSayMiau1();
        System.out.println(cat1.type);
        cat1.setSayMiau(true);
        System.out.println(cat1.type);
    }
}
