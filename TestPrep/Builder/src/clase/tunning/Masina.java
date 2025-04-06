package clase.tunning;

import java.util.List;

public class Masina implements IMasina {
    private final String marca;
    private final String model;
    private final int an;
    private final String dotari;
    private final boolean hasCustomInterior;
    private final String interior;
    private final boolean hasCustomDoors;
    private final String doors;
    private final boolean hasCustomChairs;
    private final String chairs;

    @Override
    public String getDotari() {
        return this.dotari;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    public String getModel() {
        return model;
    }

    public int getAn() {
        return an;
    }

    public boolean isHasCustomInterior() {
        return hasCustomInterior;
    }

    public String getInterior() {
        return interior;
    }

    public boolean isHasCustomDoors() {
        return hasCustomDoors;
    }

    public String getDoors() {
        return doors;
    }

    public boolean isHasCustomChairs() {
        return hasCustomChairs;
    }

    public String getChairs() {
        return chairs;
    }

    Masina(String marca, String model, int an, String dotari, boolean hasCustomInterior, String interior, boolean hasCustomDoors, String doors, boolean hasCustomChairs, String chairs) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.dotari = dotari;
        this.hasCustomInterior = hasCustomInterior;
        this.interior = interior;
        this.hasCustomDoors = hasCustomDoors;
        this.doors = doors;
        this.hasCustomChairs = hasCustomChairs;
        this.chairs = chairs;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", an=" + an +
                ", dotari=" + dotari +
                ", hasCustomInterior=" + hasCustomInterior +
                ", interior='" + interior + '\'' +
                ", hasCustomDoors=" + hasCustomDoors +
                ", doors='" + doors + '\'' +
                ", hasCustomChairs=" + hasCustomChairs +
                ", chairs='" + chairs + '\'' +
                '}';
    }
}
