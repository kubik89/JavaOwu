package lesson9.HW;

public class Main {
    public static void main(String[] args) {

        ContentReader contentReader = new ContentReader();
        contentReader.readFrom();
        contentReader.lineStorages.forEach(System.out::println);
    }
}
