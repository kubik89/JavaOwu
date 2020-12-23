package lesson9.HW;

public class LineStorage {

    String text;

    public LineStorage() {}

    public LineStorage(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "LineStorage{" +
                "text='" + text + '\'' +
                '}';
    }
}
