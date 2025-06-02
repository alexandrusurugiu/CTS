package taxe.program;

import taxe.clase.*;

public class Main {
    public static void main(String[] args) {
        CalculatorTaxe calculator = new CalculatorTaxe();

        Tranzactie tranzactie = new Tranzactie(2000, "SUA");
        Tranzactie tranzactie2 = new Tranzactie(500, "Romania");
        Tranzactie tranzactie3 = new Tranzactie(7500, "Rusia");

        calculator.setStrategie(new StrategieUE());
        System.out.println("Taxele pentru Romania: " + calculator.calculeazaTaxeTranzactie(tranzactie2));

        calculator.setStrategie(new StrategieSUA());
        System.out.println("Taxele pentru SUA: " + calculator.calculeazaTaxeTranzactie(tranzactie));

        calculator.setStrategie(new StrategieRusia());
        System.out.println("Taxele pentru Rusia: " + calculator.calculeazaTaxeTranzactie(tranzactie3));

    }
}
