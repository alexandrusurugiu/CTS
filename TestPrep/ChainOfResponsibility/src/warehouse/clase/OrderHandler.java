package warehouse.clase;

public interface OrderHandler {
    void setNextHandler(OrderHandler nextHandler);
    void handleOrder(Order order);
}
