package clase.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements IBuilder {
    private int size;
    private String crust;
    private List<String> toppings;
    private boolean isExtraCheese;

    public int getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    public boolean isExtraCheese() {
        return isExtraCheese;
    }

    public PizzaBuilder setExtraCheese(boolean extraCheese) {
        this.isExtraCheese = extraCheese;
        return this;
    }

    public PizzaBuilder(int size, String crust) {
        this.size = size;
        this.crust = crust;
        this.toppings = new ArrayList<>();
        this.isExtraCheese = false;
    }



    @Override
    public Pizza build() {
        return new Pizza(size, crust, toppings, isExtraCheese);
    }
}
