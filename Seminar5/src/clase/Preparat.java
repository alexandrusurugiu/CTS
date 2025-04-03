package clase;

public class Preparat {
    private String denumire;
    private int nrMinute;
    private int nrGradeGatire;

    public Preparat(String denumire, int nrMinute, int nrGradeGatire) {
        this.denumire = denumire;
        this.nrMinute = nrMinute;
        this.nrGradeGatire = nrGradeGatire;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNrMinute() {
        return nrMinute;
    }

    public int getNrGradeGatire() {
        return nrGradeGatire;
    }

    @Override
    public String toString() {
        return "Preparat{" +
                "denumire='" + denumire + '\'' +
                ", nrMinute=" + nrMinute +
                ", nrGradeGatire=" + nrGradeGatire +
                '}';
    }
}
