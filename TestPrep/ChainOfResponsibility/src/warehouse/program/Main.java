package warehouse.program;

import warehouse.clase.*;

public class Main {
    public static void main(String[] args) {
        BaseOrderHandler stockHandler = new StockHandler();
        BaseOrderHandler paymentHandler = new PaymentHandler();
        BaseOrderHandler shippingHandler = new ShippingHandler();

        Order order = new Order("123", true, true, true);
        Order order2 = new Order("456", false, true, true);
        Order order3 = new Order("789", true, false, true);

        Site site = new Site(stockHandler, paymentHandler, shippingHandler);
        site.proccessOrder(order);
        site.proccessOrder(order2);
        site.proccessOrder(order3);
    }
}
