package warehouse.clase;

public class PaymentHandler extends BaseOrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (!order.isPaymentConfirmed()) {
            System.out.println("The order has not been payed yet!");
        } else {
            System.out.println("The order has been payed. Passing to the next step...");
            passToNext(order);
        }
    }
}
