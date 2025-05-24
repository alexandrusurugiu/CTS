package masina.clase;

public abstract class DecoratorMasina extends Masina {
    protected Masina masina;

    public DecoratorMasina(Masina masina) {
        this.masina = masina;
    }

    @Override
    public double getCost() {
        return masina.getCost();
    }

    @Override
    public String getDescriere() {
        return masina.getDescriere();
    }
}
