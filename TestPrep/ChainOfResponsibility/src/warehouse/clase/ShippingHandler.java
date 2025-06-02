package warehouse.clase;

public class ShippingHandler extends BaseOrderHandler{
    @Override
    public void handleOrder(Order order) {
        if (!order.isShippingAvailable()) {
            System.out.println("The shipping is not available for this order!");
        } else {
            System.out.println("The shipping method has been selected for this order!");
        }
    }
}
