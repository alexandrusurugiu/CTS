package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Jucator implements Cloneable{
    protected String name;
    protected int varsta;
    protected List<String> medicamente;
    protected List<String> antrenamente;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public List<String> getMedicamente() {
        return medicamente;
    }

    public void setMedicamente(List<String> medicamente) {
        this.medicamente = medicamente;
    }

    public List<String> getAntrenamente() {
        return antrenamente;
    }

    public void setAntrenamente(List<String> antrenamente) {
        this.antrenamente = antrenamente;
    }

    public Jucator(String name, int varsta, List<String> medicamente, List<String> antrenamente) {
        this.name = name;
        this.varsta = varsta;
        this.medicamente = medicamente;
        this.antrenamente = antrenamente;
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "name='" + name + '\'' +
                ", varsta=" + varsta +
                ", medicamente=" + medicamente +
                ", antrenamente=" + antrenamente +
                '}';
    }

    public abstract void afisezaDetalii();

    @Override
    protected Jucator clone() throws CloneNotSupportedException {

        return (Jucator) super.clone();
    }

    public void addMedicament(String medicament) {
        medicamente.add(medicament);
    }
}