package clase.schimb_valutar;

public class AdapterPayment extends NewPaymentSystem implements IOldPaymentSystem {
    @Override
    public void payInUSD(double amount) {
        this.payInEUR(amount);
    }
}
