package lesson9.HW;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Написати клас ContentReader,
// який в потоці читатиме вміст файлу
// і записуватиме кожен рядок в LineStorage обєкт.

public class ContentReader {

    File file = new File("lesson9HW.txt");
    List<LineStorage> lineStorages = new ArrayList<>();

    public void readFrom() {
        String someLine;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((someLine = bufferedReader.readLine()) != null) {
                lineStorages.add(new LineStorage(someLine));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
