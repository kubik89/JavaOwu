package lesson9.CW;

public class CreditCard {

    private final BankAccount bankAccount;
    boolean isEnoughMoney;

    public CreditCard(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.isEnoughMoney = true;
    }

    public boolean isEnoughMoney() {
        return isEnoughMoney;
    }

    public int takeMoneyfromCard(int money) {
        synchronized (bankAccount) {
            try {
                if (this.bankAccount.getAmountMoney() >= money) {
                    System.out.println(Thread.currentThread().getName() + " want to take money from Card " + money);
                    Thread.sleep(300);
                    this.bankAccount.takeMoneyfromAccount(money);
                    System.out.println(Thread.currentThread().getName() + " left money " + this.bankAccount.getAmountMoney());
                } else {
                    isEnoughMoney = false;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            return this.bankAccount.getAmountMoney();
    }
}
