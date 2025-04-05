package clase.pizza;

import java.util.List;

public class Pizza {
    private final int size;
    private final String crust;
    private final List<String> toppings;
    private final boolean extraCheese;

    Pizza(int size, String crust, List<String> toppings, boolean extraCheese) {
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
        this.extraCheese = extraCheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", crust='" + crust + '\'' +
                ", toppings=" + toppings +
                ", extraCheese=" + extraCheese +
                '}';
    }
}
