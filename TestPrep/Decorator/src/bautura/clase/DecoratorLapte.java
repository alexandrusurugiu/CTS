package bautura.clase;

public class DecoratorLapte extends DecoratorBautura {
    public DecoratorLapte(Bautura bautura) {
        super(bautura);
    }

    @Override
    public double getCost() {
        return bautura.getCost() + 2.5;
    }

    @Override
    public String getDescriere() {
        return super.getDescriere() + " cu lapte";
    }
}
