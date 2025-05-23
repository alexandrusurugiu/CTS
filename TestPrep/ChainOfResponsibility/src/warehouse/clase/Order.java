package warehouse.clase;

public class Order {
    private String id;
    private boolean hasEnoughStock;
    private boolean paymentConfirmed;
    private boolean shippingAvailable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isHasEnoughStock() {
        return hasEnoughStock;
    }

    public void setHasEnoughStock(boolean hasEnoughStock) {
        this.hasEnoughStock = hasEnoughStock;
    }

    public boolean isPaymentConfirmed() {
        return paymentConfirmed;
    }

    public void setPaymentConfirmed(boolean paymentConfirmed) {
        this.paymentConfirmed = paymentConfirmed;
    }

    public boolean isShippingAvailable() {
        return shippingAvailable;
    }

    public void setShippingAvailable(boolean shippingAvailable) {
        this.shippingAvailable = shippingAvailable;
    }

    public Order(String id, boolean hasEnoughStock, boolean paymentConfirmed, boolean shippingAvailable) {
        this.id = id;
        this.hasEnoughStock = hasEnoughStock;
        this.paymentConfirmed = paymentConfirmed;
        this.shippingAvailable = shippingAvailable;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", hasEnoughStock=" + hasEnoughStock +
                ", paymentConfirmed=" + paymentConfirmed +
                ", shippingAvailable=" + shippingAvailable +
                '}';
    }
}
