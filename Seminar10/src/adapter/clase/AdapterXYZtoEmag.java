package adapter.clase;

public class AdapterXYZtoEmag implements IEvaluareClient {
    private CalculReducereEmag calculReducereEmag = new CalculReducereEmag();

    @Override
    public double acordaDiscount(double discount) {
        System.out.println("Pare ca calculeaza XYZ dar ...");
        Client client = new Client("John Doe", discount);
        return calculReducereEmag.getReducere(client);
    }
}
