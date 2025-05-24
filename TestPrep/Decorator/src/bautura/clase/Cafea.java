package bautura.clase;

public class Cafea extends Bautura {
    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getDescriere() {
        return "Cafea simpla";
    }
}
