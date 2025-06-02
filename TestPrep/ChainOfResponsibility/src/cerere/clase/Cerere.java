package cerere.clase;

public class Cerere {
    private String descriere;
    private double suma;

    public Cerere(String descriere, double suma) {
        this.descriere = descriere;
        this.suma = suma;
    }

    public String getDescriere() {
        return descriere;
    }

    public double getSuma() {
        return suma;
    }
}
