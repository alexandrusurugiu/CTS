package clase.schimb_valutar;

public class NewPaymentSystem implements INewPaymentSystem {
    @Override
    public void payInEUR(double amount) {
        double euroAmount = amount*0.89;
        System.out.println("The amount of " + euroAmount + " euros was successfully payed!");
    }
}
