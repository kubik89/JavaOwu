package lesson8.CW;

public class MyException extends RuntimeException{

    private String detailedMessage;

    public MyException(String message, String detailedMessage) {
        super(message);
        this.detailedMessage = detailedMessage;
    }

    public String getDetailedMessage() {
        return detailedMessage;
    }
}
