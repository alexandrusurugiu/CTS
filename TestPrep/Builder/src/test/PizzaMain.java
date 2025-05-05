package test;

import clase.pizza.Pizza;
import clase.pizza.PizzaBuilder;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza p1 = new PizzaBuilder(35, "pufos").addTopping("Bacon").setExtraCheese(true).build();
        Pizza p2 = new PizzaBuilder(40, "subtire").build();

        System.out.println(p1);
        System.out.println(p2);
    }
}
