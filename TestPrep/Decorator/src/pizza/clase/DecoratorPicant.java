package pizza.clase;

public class DecoratorPicant extends DecoratorPizza {
    private int nivelIuteala;

    public DecoratorPicant(Pizza pizza, int nivelIuteala) {
        super(pizza);
        this.nivelIuteala = nivelIuteala;
    }

    @Override
    public String getComponents() {
        return super.getComponents() + ", iuteala " + this.nivelIuteala;
    }

    @Override
    public int getPret() {
        return 0;
    }
}
