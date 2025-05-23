package clase.schimb_valutar;

public class AdapterPayment extends NewPaymentSystem implements IOldPaymentSystem {
    @Override
    public void payInUSD(double amount) {
        double euroAmount = amount*0.89;
        this.payInEUR(euroAmount);
    }
}
