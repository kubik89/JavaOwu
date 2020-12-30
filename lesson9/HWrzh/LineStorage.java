package lesson9.HWrzh;

import java.util.concurrent.atomic.AtomicBoolean;

public class LineStorage {
    private String line = "";

    // isFinished для того, щоб при зміні значення вказати, що хтось все прочитав (можна було й простим boolean)
    private AtomicBoolean isFinished = new AtomicBoolean(false);

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public AtomicBoolean isFinished() {
        return isFinished;
    }

}
