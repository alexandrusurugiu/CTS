package test;

import clase.Dish;
import clase.Oven;

public class RegistryMain {
    public static void main(String[] args) {
        Oven.registryOven(200);
        Oven.registryOven(250);
        Oven.registryOven(180);

        Dish pizza = new Dish("Pizza", 30, 220);
        Dish lasagna = new Dish("Lasagna", 45, 200);
        Dish cake = new Dish("Cake", 60, 180);

        try {
            Oven.addDish(pizza);
            Oven.addDish(lasagna);
            Oven.addDish(cake);
        } catch (RuntimeException e) {
            System.err.println("Eroare: " + e.getMessage());
        }

        System.out.println("--- Starea cuptoarelor ---");
        for (int i = 0; i < Oven.getRegistrySize(); i++) {
            Oven oven = Oven.getOvenById(i);
            System.out.println("Cuptor " + i + ": " + oven);
            System.out.println("Timp de asteptare: " + oven.calculateOvenWaitingTime() + " minute");
        }

        try {
            Oven.registryOven(300);
            Oven.registryOven(150);
        } catch (RuntimeException e) {
            System.err.println("Eroare la inregistrare: " + e.getMessage());
        }
    }
}
