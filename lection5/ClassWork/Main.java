package lection5.ClassWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("second");
        System.out.println(list.contains("third"));
        System.out.println(list.get(2));
        System.out.println(list.size());
        list.set(3, "fourth");
        list.add(list.size(), "fifth");
        System.out.println("list - " + list);

        String[] array = new String[] {"first", "second"};
        List<String> str1 = Arrays.asList(array);
        List<String> str2 = Arrays.asList("third", "fourth", "fifth");
        System.out.println("str1 - " + str1);
        System.out.println("str2 - " + str2);

        String s1 = "s1";
        String s2 = "s1";

        Book book1 = new Book(1, "Lalala", 10);
        Book book2 = new Book(1, "Lalala", 10);

//        Якщо значення стрічки дійсно рівне одна одній - вони рівні - це true.
//        Стрічки знаходяться в stringPool, тому якщо вони однакові, то ніби рівні в цьому басейні, і не повторюютья
        System.out.println(s1.equals(s2) + " - Стрінга s1 рівна s2?");

//        Якщо значення обєкта дійсно рівне іншому - вони всеодно НЕ рівні - це false.
//        Обєкти порівнюються за посиланням, а посилання в кожного різне.
//        Обєкти будуть рівні лише в тому випадку, якщо ми напишемо book1 = book2, а потім порівняємо
        System.out.println(book1.equals(book2) + " - Обєкт рівний обєкту?");

        List<Book> list1 = new ArrayList<>();
        list1.add(new Book(1, "Чотири лапи", 50));
        list1.add(new Book(2, "VW", 65));

        Book book3 = new Book(3, "Далекобійники", 30);
        list1.add(book3);

//        for (Book book : list1) {
//            if (book.getName().startsWith("V")) {
//                list1.remove(book);
//            }
//            System.out.println("Видалення всіх з V - " + list1);
//        }
//
//        for (Book book : list1) {
//                list1.remove(book);
//            }
//            System.out.println("Видалення всіх з list1 - " + list1);

        Iterator<Book> iterator = list1.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
        while (iterator.hasNext()) {
            Book next = iterator.next();
            System.out.println(next);
        }

        Set<Book> set1 = new HashSet<>();
        set1.add(new Book(1, "AW", 10));
        set1.add(new Book(2, "CW", 20));
        set1.add(new Book(1, "DW", 30));
        System.out.println(set1);

        Map<String, Book> map1 = new HashMap<>();
        map1.put("first", new Book(3, "My World", 10));
        map1.put("first", new Book(3, "My World", 10));

    }


    }
