package clase.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Cloneable {
    private String name;
    private List<String> toppings;
    private double price;

    public String getName() {
        return name;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public double getPrice() {
        return price;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public Pizza(String name, List<String> toppings, double price) {
        this.name = name;
        this.toppings = new ArrayList<>(toppings);
        this.price = price;
    }

    @Override
    public Pizza clone() throws CloneNotSupportedException {
        Pizza p = (Pizza) super.clone();
        p.toppings = new ArrayList<>(this.toppings);

        return p;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                ", price=" + price +
                '}';
    }
}
