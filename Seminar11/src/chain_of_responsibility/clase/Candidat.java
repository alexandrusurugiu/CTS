package chain_of_responsibility.clase;

public class Candidat {
    private String name;
    private String eseu;
    private float medieBac;
    private float medieExamen;

    public Candidat(String name, float medieBac, float medieExamen, String eseu) {
        this.name = name;
        this.eseu = eseu;
        this.medieBac = medieBac;
        this.medieExamen = medieExamen;
    }

    public String getName() {
        return name;
    }

    public String getEseu() {
        return eseu;
    }

    public float getMedieBac() {
        return medieBac;
    }

    public float getMedieExamen() {
        return medieExamen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEseu(String eseu) {
        this.eseu = eseu;
    }

    public void setMedieBac(float medieBac) {
        this.medieBac = medieBac;
    }

    public void setMedieExamen(float medieExamen) {
        this.medieExamen = medieExamen;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "name='" + name + '\'' +
                ", eseu='" + eseu + '\'' +
                ", medieBac=" + medieBac +
                ", medieExamen=" + medieExamen +
                '}';
    }
}
