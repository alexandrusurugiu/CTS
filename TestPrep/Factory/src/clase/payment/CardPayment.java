package clase.payment;

public class CardPayment implements IPayment {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void proccessPayment(double amount) {
        System.out.println("Plata procesata prin Card (" + cardNumber + "):" + amount + " RON");
    }
}
