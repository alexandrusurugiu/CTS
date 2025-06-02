package meniuri.clase;

public class OfertaMeniu {
    private String denumireMeniu;
    private int nrCalorii;
    private int nrCarbohidrati;

    public String getDenumireMeniu() {
        return denumireMeniu;
    }

    public void setDenumireMeniu(String denumireMeniu) {
        this.denumireMeniu = denumireMeniu;
    }

    public int getNrCalorii() {
        return nrCalorii;
    }

    public void setNrCalorii(int nrCalorii) {
        this.nrCalorii = nrCalorii;
    }

    public int getNrCarbohidrati() {
        return nrCarbohidrati;
    }

    public void setNrCarbohidrati(int nrCarbohidrati) {
        this.nrCarbohidrati = nrCarbohidrati;
    }

    public OfertaMeniu(String denumireMeniu, int nrCalorii, int nrCarbohidrati) {
        this.denumireMeniu = denumireMeniu;
        this.nrCalorii = nrCalorii;
        this.nrCarbohidrati = nrCarbohidrati;
    }

    @Override
    public String toString() {
        return "OfertaMeniu{" +
                "denumireMeniu='" + denumireMeniu + '\'' +
                ", nrCalorii=" + nrCalorii +
                ", nrCarbohidrati=" + nrCarbohidrati +
                '}';
    }
}
