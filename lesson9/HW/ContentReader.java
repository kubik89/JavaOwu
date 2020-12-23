package lesson9.HW;

import java.io.*;

//Написати клас ContentReader,
// який в потоці читатиме вміст файлу
// і записуватиме кожен рядок в LineStorage обєкт.

public class ContentReader implements Runnable{

    File file = new File("lesson9HW.txt");

    @Override
    public void run() {
        String someLine;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((someLine = bufferedReader.readLine()) != null) {
                ContentPrinter contentPrinter = new ContentPrinter();
                contentPrinter.writeToList(new LineStorage(someLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
