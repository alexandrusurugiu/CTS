package taxe.clase;

public class Tranzactie {
    private double suma;
    private String tara;

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public Tranzactie(double suma, String tara) {
        this.suma = suma;
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "suma=" + suma +
                ", tara='" + tara + '\'' +
                '}';
    }
}
