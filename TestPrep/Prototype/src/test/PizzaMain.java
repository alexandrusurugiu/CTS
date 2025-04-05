package test;

import clase.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> toppings = new ArrayList<>(List.of("ham", "cheese", "veggie", "pepperoni", "sauce"));
        Pizza p1 = new Pizza("Margherita", toppings, 36.00);

        System.out.println(p1);

        Pizza p2 = p1.clone();
        p1.addTopping("onions");
        p2.getToppings().remove("veggie");
        System.out.println("\n=======Pizzas=======\n");
        System.out.println("Original pizza: " + p1);
        System.out.println("Cloned pizza: " + p2);
    }

}
