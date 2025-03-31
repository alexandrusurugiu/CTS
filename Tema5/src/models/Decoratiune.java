package models;

public class Decoratiune {
    private final String nume;
    private final String material;

    public Decoratiune(String nume, String material) {
        this.nume = nume;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return nume + " (" + material + ")";
    }
}
