package adapter.clase;

public class Client {
    private String nume;
    private double totalAchizitii;

    public Client(String nume, double totalAchizitii) {
        this.nume = nume;
        this.totalAchizitii = totalAchizitii;
    }

    public String getNume() {
        return nume;
    }

    public double getTotalAchizitii() {
        return totalAchizitii;
    }
}
