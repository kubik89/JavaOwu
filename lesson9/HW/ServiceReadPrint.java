package lesson9.HW;

import java.util.ArrayList;
import java.util.List;

public class ServiceReadPrint {

    List<LineStorage> lineStorages = new ArrayList<>();

    public void writeToList(LineStorage lineStorage) {
        lineStorages.add(lineStorage);
//        lineStorages.forEach(System.out::println);
    }

    public void showList() {
        lineStorages.forEach(System.out::println);
    }
    }
