package bautura.clase;

public class DecoratorZahar extends DecoratorBautura {
    public DecoratorZahar(Bautura bautura) {
        super(bautura);
    }

    @Override
    public String getDescriere() {
        return super.getDescriere() + " si zahar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }
}
