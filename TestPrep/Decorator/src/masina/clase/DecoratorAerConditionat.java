package masina.clase;

public class DecoratorAerConditionat extends DecoratorMasina {
    public DecoratorAerConditionat(Masina masina) {
        super(masina);
    }

    @Override
    public double getCost() {
        return masina.getCost() + 500;
    }

    @Override
    public String getDescriere() {
        return masina.getDescriere() + " cu AC";
    }
}
