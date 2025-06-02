package warehouse.clase;

public class StockHandler extends BaseOrderHandler {
    @Override
    public void handleOrder(Order order) {
        if (!order.isHasEnoughStock()) {
            System.out.println("\nNot enough stock for this order!");
        } else {
            System.out.println("\nThe stock is sufficient. Passing to the next step...");
            passToNext(order);
        }
    }
}
