package models;

public class PodeaPersonalizata extends Podea {
    public PodeaPersonalizata(int duritate) {
        if (duritate < 1 || duritate > 10) {
            throw new IllegalArgumentException("Duritatea trebuie sa fie intre 1 si 10");
        }
        this.duritate = duritate;
    }

    @Override
    public String toString() {
        return "Personalizata (duritate: " + duritate + ")";
    }
}
