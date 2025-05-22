package clase.client;

public class EvaluareClientFirmaA implements IEvaluareClientFirmaA {
    @Override
    public void analizaClientFirmaA(int costTotalEveniment) {
        System.out.println("Metoda analiza client firma A");
        double discount = 0;

        if (costTotalEveniment > 1000) {
            discount = 0.10;
        } else {
            if (costTotalEveniment > 500) {
                discount = 0.05;
            } else {
                discount = 0.00;
            }
        }

        System.out.println("S-a oferit un discount de " + discount);
    }
}
