package taxe.clase;

public class StrategieUE implements ICalculTaxe {
    private static final double TAX = 0.23;

    @Override
    public double calculeazaTaxe(Tranzactie tranzactie) {
        double suma = 0;
        if (tranzactie.getTara().equals("Romania"))
            suma = tranzactie.getSuma()*TAX;

        return suma;
    }
}
