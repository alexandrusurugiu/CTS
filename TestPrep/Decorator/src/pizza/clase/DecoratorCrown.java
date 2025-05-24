package pizza.clase;

public class DecoratorCrown extends DecoratorPizza {

    public DecoratorCrown(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponents() {
        return super.getComponents() + ", margine cu branza vegana";
    }

    @Override
    public int getPret() {
        return super.getPret() + 10;
    }
}
