package lesson9.CW;

public class BankAccount {

    private int amountMoney;

    public BankAccount(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public int takeMoneyfromAccount(int money) {
        return this.amountMoney -= money;
    }
}
