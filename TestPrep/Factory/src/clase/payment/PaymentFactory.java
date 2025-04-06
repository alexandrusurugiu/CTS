package clase.payment;

public class PaymentFactory {
    public static IPayment createPayment(String method, String accountInfo) {
        switch (method) {
            case "card" -> {
                return new CardPayment(accountInfo);
            }
            case "paypal" -> {
                return new PayPalPayment(accountInfo);
            }
            default -> {
                throw new RuntimeException("Unsupported payment method: " + method);
            }
        }
    }
}
