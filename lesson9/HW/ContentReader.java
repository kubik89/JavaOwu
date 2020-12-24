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
                ServiceReadPrint service = new ServiceReadPrint();
            while ((someLine = bufferedReader.readLine()) != null) {
                service.writeToList(new LineStorage(someLine));
//                System.out.println("Read " + someLine);
            System.out.println("Прочитав один рядок і записав у List");
            }
            service.lineStorages.forEach(System.out::println);
            System.out.println("Прочитав ВСІ і записав у List");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
