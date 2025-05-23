package clase.schimb_valutar;

public class NewPaymentSystem implements INewPaymentSystem {
    @Override
    public void payInEUR(double amount) {
        System.out.println("The amount of " + amount + " euros was successfully payed!");
    }
}
