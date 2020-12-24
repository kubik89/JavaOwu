package lesson9.HW;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// Написати клас ContentPrinter, який в потоці виводитиме на екран вміст LineStorage.
public class ContentPrinter implements Runnable {

    ServiceReadPrint service = new ServiceReadPrint();
    File newFile = new File("newFile.txt");

    private void writeToNewFile() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(newFile)) {
            System.out.println("Записую рядок з ліста у НОВИЙ файл");
            for (LineStorage lineStorage : service.lineStorages) {
                System.out.println(lineStorage);
                fileOutputStream.write(lineStorage.getText().getBytes());
            }
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    @Override
    public void run() {
        writeToNewFile();
    }
}
