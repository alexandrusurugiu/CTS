package clase;

import exceptii.ExceptieModelLungime;
import exceptii.ExceptieModelNull;
import exceptii.ExceptiePret;

public class Masina {
    private String model;
    private double price;
    private int anFabricatie;

    public Masina(String model, double price, int anFabricatie) throws ExceptieModelNull, ExceptieModelLungime, ExceptiePret {
        if (model == null) {
            throw new ExceptieModelNull();
        }

        if (model.length() < 2) {
            throw new ExceptieModelLungime();
        }

        if (price <= 1000 || price > 100000) {
            throw new ExceptiePret();
        }
        this.model = model;
        this.price = price;
        this.anFabricatie = anFabricatie;
    }

    public Masina() {
        this.model = "NA";
        this.price = 0;
        this.anFabricatie = 1990;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws ExceptiePret {
        if (price <= 1000 || price > 100000) {
            this.price = price;
            throw new ExceptiePret();
        }
        this.price = price;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }
}
