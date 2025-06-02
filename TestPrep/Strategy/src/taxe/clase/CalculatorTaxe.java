package taxe.clase;

public class CalculatorTaxe {
    private ICalculTaxe strategie;

    public void setStrategie(ICalculTaxe strategie) {
        this.strategie = strategie;
    }

    public double calculeazaTaxeTranzactie(Tranzactie tranzactie) {
        if (strategie != null) {
            return strategie.calculeazaTaxe(tranzactie);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
