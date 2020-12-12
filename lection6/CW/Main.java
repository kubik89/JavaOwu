package lection6.CW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date(System.currentTimeMillis());
//        Date date = new Date(System.currentTimeMillis());
//        System.out.println(date);
//        System.out.println(date.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); // задаю такий патерн для формату
                                                                                        // вхідних даних
        Date date1 = simpleDateFormat.parse("2020-12-24");
        System.out.println(date1); // Thu Dec 24 00:00:00 EET 2020
        System.out.println(simpleDateFormat.format(date1)); // 2020-12-24

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yy");
        System.out.println(simpleDateFormat1.format(date1));

//        Calendar.getInstance().set();

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.parse("2020-12-24");
        LocalDate localDate3 = LocalDate.parse("20201224", DateTimeFormatter.ofPattern("yyyyMMdd"));

        String localTime1 = "15:58";
        LocalTime newLocalTime = LocalTime.parse(localTime1, DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println(newLocalTime);

//        System.out.println(localDate1);
//        System.out.println(localDate1.lengthOfMonth());
//        System.out.println(localDate1.getDayOfWeek());
//        System.out.println(localDate1.getDayOfMonth() + " День місяця");
//        System.out.println(localDate1.plusDays(20) + " Нова дата");
//        System.out.println(localDate2);
//        System.out.println(localDate3.format(DateTimeFormatter.ofPattern("yyyyMMdd")));

        Set<String> set = new TreeSet<>();
        set.add("first");
        set.add("second");
        set.add("third");
        System.out.println(set);

        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(5);
        integerSet.add(0);
        integerSet.add(10);
        System.out.println(integerSet);

        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person(5, "Vova", 10, LocalDate.of(1990, 12, 31)));
        personSet.add(new Person(1, "Ivan", 10, LocalDate.of(2005, 10, 30)));
        personSet.add(new Person(5, "Katya", 10, LocalDate.of(1990, 12, 29)));

        for (Person person : personSet) {
            System.out.println(person);
        }

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(5, "Vova", 10, LocalDate.of(1990, 12, 31)));
        personList.add(new Person(1, "Ivan", 10, LocalDate.of(2005, 10, 30)));
        personList.add(new Person(5, "Katya", 10, LocalDate.of(1990, 12, 29)));

        personList.sort((o1, o2) -> o1.getId() - o2.getId());
        for (Person person : personList) {
            System.out.println("Через лямбди: " + person);

        }
    }
}
