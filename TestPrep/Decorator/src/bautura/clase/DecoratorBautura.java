package bautura.clase;

public abstract class DecoratorBautura extends Bautura {
    protected Bautura bautura;

    public DecoratorBautura(Bautura bautura) {
        this.bautura = bautura;
    }

    @Override
    public double getCost() {
        return bautura.getCost();
    }

    @Override
    public String getDescriere() {
        return bautura.getDescriere();
    }
}
