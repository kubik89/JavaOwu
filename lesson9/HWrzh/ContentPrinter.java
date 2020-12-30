package lesson9.HWrzh;

import java.util.concurrent.atomic.AtomicBoolean;

public class ContentPrinter implements Runnable {

    private final LineStorage lineStorage;
    private AtomicBoolean linePrinted;
    private AtomicBoolean lineWritten;


    public ContentPrinter(LineStorage lineStorage, AtomicBoolean linePrinted, AtomicBoolean lineWritten) {
        this.lineStorage = lineStorage;
        this.linePrinted = linePrinted;
        this.lineWritten = lineWritten;
    }

    @Override
    public void run() {
        // Блокую lineStorage щоб інші його юзали
        synchronized (lineStorage) {
            // читаю доти доки не false
            while (!lineStorage.isFinished().get()) {
                while (linePrinted.get()) {
                    try {
        // оскільки ContentPrinter стартує першим в Main (але має друкувати текст який має прочитати ContentReader,
        // тому тут відразу пишу wait - він буде чекати, щоб його розбудив ContentReader)
                        lineStorage.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        // прочитую рядок для друку
                System.out.println(lineStorage.getLine());
                linePrinted.set(true);
                if (lineWritten.get()) {
        // і повідомляє ContentReader
                    lineStorage.notifyAll();
                }
            }
            System.out.println("CP finished");
        }
    }
}
