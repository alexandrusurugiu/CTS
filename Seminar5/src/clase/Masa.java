package clase;

public class Masa {
    private int id;
    private LocatieMasa locatie;
    private int nrScaune;

    public Masa(int id, LocatieMasa locatie, int nrScaune) {
        this.id = id;
        this.locatie = locatie;
        this.nrScaune = nrScaune;
    }

    public int getId() {
        return id;
    }

    public LocatieMasa getLocatie() {
        return locatie;
    }

    public int getNrScaune() {
        return nrScaune;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", locatie=" + locatie +
                ", nrScaune=" + nrScaune +
                '}';
    }
}
