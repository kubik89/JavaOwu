package lesson9.CW;

public class CardOwner implements Runnable{

    private CreditCard creditCard;

    public CardOwner(CreditCard creditCard) {
        this.creditCard = creditCard;
    }


    @Override
    public void run() {
        while (creditCard.isEnoughMoney()) {
            creditCard.takeMoneyfromCard(10);
        }
    }
}
