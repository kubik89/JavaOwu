package lection5.ClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println(list);

        String[] array = new String[] {"first", "second"};
        List<String> str1 = Arrays.asList(array);
        List<String> str2 = Arrays.asList("third", "fourth", "fifth");



    }
}
