package lesson9.HW;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ContentReader contentReader = new ContentReader();
        ContentPrinter contentPrinter = new ContentPrinter();

        Thread readThread = new Thread(contentReader, "Read");
        Thread writeThread = new Thread(contentPrinter, "Write");

        readThread.start();
        writeThread.start();
        readThread.join();
        writeThread.join();

    }
}
