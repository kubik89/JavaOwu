package lesson9.CW;

public class MyThread1 extends Thread{
    private String whoCreated;

    public MyThread1(String name, String whoCreated) {
        super(name);
        this.whoCreated = whoCreated;
    }

    @Override
    public void run() {
        System.out.println(whoCreated);
        for (int i = 0; i < 7; i++) {
            System.out.println(this.getName() + " : " + whoCreated);
        }
    }
}
