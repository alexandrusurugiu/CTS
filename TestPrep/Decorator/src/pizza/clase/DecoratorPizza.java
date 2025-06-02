package pizza.clase;

public abstract class DecoratorPizza extends Pizza {
    protected Pizza pizza;

    public DecoratorPizza(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public String getComponents() {
        return pizza.getComponents();
    }

    @Override
    public int getPret() {
        return pizza.getPret();
    }
}
