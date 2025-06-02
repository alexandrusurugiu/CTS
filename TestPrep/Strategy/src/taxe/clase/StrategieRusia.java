package taxe.clase;

public class StrategieRusia implements ICalculTaxe {
    private static final double TAX = 0.75;

    @Override
    public double calculeazaTaxe(Tranzactie tranzactie) {
        double suma = 0;
        if (tranzactie.getTara().equals("Rusia"))
            suma = TAX*tranzactie.getSuma();

        return suma;
    }
}
