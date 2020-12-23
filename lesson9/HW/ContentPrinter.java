package lesson9.HW;

import java.util.ArrayList;
import java.util.List;

// Написати клас ContentPrinter, який в потоці виводитиме на екран вміст LineStorage.
public class ContentPrinter implements Runnable{

    final List<LineStorage> lineStorages = new ArrayList<>();

    public void writeToList(LineStorage lineStorage) {
        lineStorages.add(lineStorage);
        lineStorages.forEach(System.out::println);
    }

    @Override
    public void run() {
        synchronized (lineStorages){
        lineStorages.forEach(System.out::println);
        }
    }
}
