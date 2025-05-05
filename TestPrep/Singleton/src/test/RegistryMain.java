package test;

import clase.Dish;
import clase.Oven;

public class RegistryMain {
    public static void main(String[] args) {
        try {
            System.out.println("Registering ovens...");
            Oven.registryOven(200);
            Oven.registryOven(250);
            Oven.registryOven(180);

            Dish pizza = new Dish("Pizza", 30, 220);
            Dish lasagna = new Dish("Lasagna", 45, 200);
            Dish cake = new Dish("Cake", 60, 180);
            Dish bread = new Dish("Bread", 40, 190);

            System.out.println("\nAdding dishes...");
            Oven.addDish(pizza);
            Oven.addDish(lasagna);
            Oven.addDish(cake);
            Oven.addDish(bread);

            System.out.println("\nCurrent oven status:");
            for (int i = 0; i < Oven.getRegistrySize(); i++) {
                Oven oven = Oven.getOvenById(i);
                System.out.println(oven);
                System.out.println("Waiting time: " + oven.calculateOvenWaitingTime() + " minutes\n");
            }

            System.out.println("Testing limits...");
            Oven.registryOven(300);
            Oven.registryOven(150);
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
