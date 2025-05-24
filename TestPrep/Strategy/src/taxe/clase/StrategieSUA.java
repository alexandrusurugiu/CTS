package taxe.clase;

public class StrategieSUA implements ICalculTaxe {
    private static final double TAX = 0.50;

    @Override
    public double calculeazaTaxe(Tranzactie tranzactie) {
        double suma = 0;
        if (tranzactie.getTara().equals("SUA"))
            suma = TAX*tranzactie.getSuma();

        return suma;
    }
}
