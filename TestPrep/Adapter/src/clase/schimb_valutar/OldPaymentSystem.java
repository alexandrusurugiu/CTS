package clase.schimb_valutar;

public class OldPaymentSystem implements IOldPaymentSystem {
    @Override
    public void payInUSD(double amount) {
        System.out.println("The amount of " + amount + " dollars was successfully payed!");
    }
}
