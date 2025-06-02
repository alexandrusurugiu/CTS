package pizza.prorgam;

import pizza.clase.DecoratorCrown;
import pizza.clase.DecoratorPicant;
import pizza.clase.Pizza;
import pizza.clase.PizzaVegetariana;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaVegetariana();
        System.out.println(pizza.getComponents());
        System.out.println(pizza.getPret());

        Pizza pizzaDecorata = new DecoratorCrown(pizza);
        //Pizza pizzaDecorata2 = new DecoratorCrown(new PizzaVegetariana());
        System.out.println(pizzaDecorata.getComponents());
        System.out.println(pizzaDecorata.getPret());

        Pizza pizzaDecorataMultiplu = new DecoratorPicant(new DecoratorCrown(new PizzaVegetariana()), 10);
        System.out.println(pizzaDecorataMultiplu.getComponents());
        System.out.println(pizzaDecorataMultiplu.getPret());
    }
}