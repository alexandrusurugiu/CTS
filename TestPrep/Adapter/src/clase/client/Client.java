package clase.client;

public class Client {
    private String nume;
    private int nrEvenimente;
    private int[] costEvenimente;

    public String getNume() {
        return nume;
    }

    public int getNrEvenimente() {
        return nrEvenimente;
    }

    public int[] getCostEvenimente() {
        return costEvenimente;
    }

    public Client(String nume, int nrEvenimente, int[] costEvenimente) {
        this.nume = nume;
        this.nrEvenimente = nrEvenimente;
        this.costEvenimente = costEvenimente;
    }
}
