package masina.clase;

public class DecoratorXenon extends DecoratorMasina {
    public DecoratorXenon(Masina masina) {
        super(masina);
    }

    @Override
    public String getDescriere() {
        return masina.getDescriere() + " si xenon";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1300;
    }
}
