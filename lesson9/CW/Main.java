package lesson9.CW;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        // Описаний Thread в класі
//        MyThread1 myThread1 = new MyThread1("Thread-MySelf", "Vova");
//        myThread1.start();

        Runnable runnable1 = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };

        Runnable runnable2 = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };

        for (int i = 0; i < 5; i++) {
            System.out.println("Це join " + i);
        }

        Thread thread1 = new Thread(runnable1, "My-Thread-1");
        Thread thread2 = new Thread(runnable2, "My-Thread-2");
        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

    }
}
