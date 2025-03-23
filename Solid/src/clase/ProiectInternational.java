package clase;

public class ProiectInternational {
    private String nume;
    private String tara;
    private String tip;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public ProiectInternational() {
    }

    public ProiectInternational(String nume, String tara, String tip) {
        this.nume = nume;
        this.tara = tara;
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "ProiectInternational: " +
                "Nume=" + nume +
                ", Tara=" + tara +
                ", Tip=" + tip;
    }
}
