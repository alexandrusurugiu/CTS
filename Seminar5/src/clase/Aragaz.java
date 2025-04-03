package clase;

import java.util.List;

public class Aragaz {
    private static Aragaz instance;

    //singleton data
    private int id;
    public final int nrMaximGrade;
    private List<Preparat> listaPreparate;

    static {
        instance = new Aragaz(270);
    }

    public int getId() {
        return id;
    }

    public int getNrMaximGrade() {
        return nrMaximGrade;
    }

    public List<Preparat> getListaPreparate() {
        return listaPreparate;
    }

    private Aragaz(int nrMaximGrade) {
        this.nrMaximGrade = nrMaximGrade;
    }

    public static Aragaz getInstance() {
        return instance;
    }

    public void addPreparat(Preparat preparat) {
        if (preparat.getNrGradeGatire() <= nrMaximGrade) {
            listaPreparate.add(preparat);
        } else {
            throw new IllegalArgumentException("Preparatul nu poate fi gatit la aragaz.");
        }
    }

    @Override
    public String toString() {
        return "Aragaz{" +
                "id=" + id +
                ", nrMaximGrade=" + nrMaximGrade +
                ", listaPreparate=" + listaPreparate +
                '}';
    }
}
