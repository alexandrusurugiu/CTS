package clase.tunning;

public class MasinaBuilder {
    private String marca;
    private String model;
    private int an;
    private String dotari;
    private boolean hasCustomInterior;
    private String interior;
    private boolean hasCustomDoors;
    private String doors;
    private boolean hasCustomChairs;
    private String chairs;

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getAn() {
        return an;
    }

    public MasinaBuilder setAn(int an) {
        this.an = an;
        return this;
    }

    public MasinaBuilder setHasCustomInterior(boolean hasCustomInterior) {

        this.hasCustomInterior = hasCustomInterior;
        return this;
    }

    public MasinaBuilder setInterior(String interior) {
        if (!hasCustomInterior) {
            throw new RuntimeException("You cannot set a custom material for the interior without selecting custom interior option!");
        }

        this.interior = interior;
        return this;
    }

    public MasinaBuilder setHasCustomDoors(boolean hasCustomDoors) {

        this.hasCustomDoors = hasCustomDoors;
        return this;
    }

    public MasinaBuilder setDoors(String doors) {
        if (!hasCustomDoors) {
            throw new RuntimeException("You cannot set a custom material for the doors without selecting custom doors option!");
        }

        this.doors = doors;
        return this;
    }

    public MasinaBuilder setHasCustomChairs(boolean hasCustomChairs) {

        this.hasCustomChairs = hasCustomChairs;
        return this;
    }

    public MasinaBuilder setChairs(String chairs) {
        if (!hasCustomChairs) {
            throw new RuntimeException("You cannot set a custom material for the chairs without selecting custom chairs option!");
        }

        this.chairs = chairs;
        return this;
    }

    public MasinaBuilder(String marca, String model, String dotari) {
        this.marca = marca;
        this.model = model;
        this.dotari = dotari;
        this.an = 2000;
        this.hasCustomInterior = false;
        this.interior = "";
        this.hasCustomDoors = false;
        this.doors = "";
        this.hasCustomChairs = false;
        this.chairs = "";
    }

    public Masina build() {
        return new Masina(marca, model, an, dotari, hasCustomInterior, interior, hasCustomDoors, doors, hasCustomChairs, chairs);
    }
}
