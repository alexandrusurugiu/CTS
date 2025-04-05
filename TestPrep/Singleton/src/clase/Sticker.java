package clase;

public class Sticker implements Cloneable{
    private int dimensiune;
    private String culoare;

    public int getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    Sticker(Masina m) {
        this.dimensiune = 100;
        this.culoare = "default";
        System.out.println("Apel constructor");
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "dimensiune=" + dimensiune +
                ", culoare='" + culoare + '\'' +
                '}';
    }

    @Override
    protected Sticker clone() throws CloneNotSupportedException {
        return (Sticker) super.clone();
    }
}
