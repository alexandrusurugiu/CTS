package warehouse.clase;

public class Site {
    private BaseOrderHandler stockHandler;
    private BaseOrderHandler paymentHandler;
    private BaseOrderHandler shippingHandler;

    public Site(BaseOrderHandler stockHandler, BaseOrderHandler paymentHandler, BaseOrderHandler shippingHandler) {
        this.stockHandler = stockHandler;
        this.paymentHandler = paymentHandler;
        this.shippingHandler = shippingHandler;

        this.stockHandler.setNextHandler(paymentHandler);
        this.paymentHandler.setNextHandler(shippingHandler);
    }

    public void proccessOrder(Order order) {
        stockHandler.handleOrder(order);
    }
}
