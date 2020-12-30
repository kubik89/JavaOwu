package lesson9.HWrzh;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

public class ContentReader implements Runnable{
    private final LineStorage lineStorage;
    private BufferedReader bufferedReader;
    private AtomicBoolean lineWritten;
    private AtomicBoolean linePrinted;

    public ContentReader(LineStorage lineStorage, BufferedReader bufferedReader, AtomicBoolean lineWritten, AtomicBoolean linePrinted) {
        this.lineStorage = lineStorage;
        this.bufferedReader = bufferedReader;
        this.lineWritten = lineWritten;
        this.linePrinted = linePrinted;
    }

    @Override
    public void run() {
        String line;
        // Блокую lineStorage щоб інші його юзали
        synchronized (lineStorage) {
            try {
                // читаю всі рядки доки вони існують
                while ((line = bufferedReader.readLine()) != null) {
                    // записую даний рядок в lineStorage
                    lineStorage.setLine(line);

                    linePrinted.set(false);
                    lineWritten.set(false);
                // повідомляю обєкти чи класи які чекають на lineStorage, що він доступний, а сам йду спати
                    lineStorage.notifyAll();
                    try {
                        lineStorage.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            // змінюю статус що прочитав всі рядки й закінчив
            lineStorage.isFinished().set(true);
            linePrinted.set(false);
            lineWritten.set(false);
            lineStorage.notifyAll();
        }
    }
}
