package warehouse.clase;

public abstract class BaseOrderHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void passToNext(Order order) {
        if (nextHandler != null) {
            nextHandler.handleOrder(order);
        } else {
            System.out.printf("No more verifications left!");
        }
    }
}
