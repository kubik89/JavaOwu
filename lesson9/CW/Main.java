package lesson9.CW;

public class Main {

    private static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

//        // Описаний Thread в класі
//        MyThread1 myThread1 = new MyThread1("Thread-MySelf", "Vova");
//        myThread1.start();

//        Runnable runnable1 = () -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " : " + i);
//            }
//        };
//
//        Runnable runnable2 = () -> {
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + " : " + i);
//            }
//        };
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Це join " + i);
//        }
//
//        Thread thread1 = new Thread(runnable1, "My-Thread-1");
//        Thread thread2 = new Thread(runnable2, "My-Thread-2");
//        thread1.start();
//        thread1.join();
//
//        thread2.start();
//        thread2.join();

//        __________

//        Thread thread1 = new Thread(() -> {
//            for (int i = 0; i < 2000; i++) {
//                System.out.println("Value " + i);
//            }
//            flag = false;
//            System.out.println("Flag changed to " + flag);
//        });
//
//        Thread thread2 = new Thread(() -> {
//            int i = 0;
//                while (flag) {
//                    i++;
//                }
//                    System.out.println("Max value " + i);
//        });
//
//        thread1.start();
//        thread2.start();

//        _________________

        BankAccount bankAccount = new BankAccount(50);
        CreditCard creditCard1 = new CreditCard(bankAccount);
        CreditCard creditCard2 = new CreditCard(bankAccount);
        CardOwner husband = new CardOwner(creditCard1);
        CardOwner wife = new CardOwner(creditCard2);

        Thread husbandThread = new Thread(husband, "Husband");
        Thread wifeThread = new Thread(wife, "Wife");

        System.out.println(bankAccount.getAmountMoney());
        husbandThread.start();
        wifeThread.start();

        husbandThread.join();
        wifeThread.join();

        System.out.println(bankAccount.getAmountMoney());


    }
}
