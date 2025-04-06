package clase.payment;

public class PayPalPayment implements IPayment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void proccessPayment(double amount) {
        System.out.println("Plata procesata prin PayPal (" + email + "):" + amount + " RON");
    }
}
