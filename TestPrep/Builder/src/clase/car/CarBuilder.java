package clase.car;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder implements IBuilder{
    private String brand;
    private String model;
    private String color;
    private int year;
    private int hp;
    private double price;
    private double consumption;
    private boolean isElectric;
    private boolean hasSunroof;
    private List<String> options;

    public CarBuilder setHp(int hp) {
        this.hp = hp;
        return this;
    }

    public CarBuilder setConsumption(double consumption) {
        this.consumption = consumption;
        return this;
    }

    public CarBuilder setElectric(boolean electric) {
        if (electric) {
            consumption = 0;
        }

        isElectric = electric;
        return this;
    }

    public CarBuilder hasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
        return this;
    }

    public CarBuilder addOption(String option) {
        if (option.equals("sunroof") && hasSunroof) {
            throw new RuntimeException("Sunroof cannot be added to the car as an option because you already added it!");
        }

        this.options.add(option);
        return this;
    }

    public CarBuilder(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;

        if (year < 2000) {
            throw new RuntimeException("The car cannot be older than 2000!");
        }
        this.year = year;

        if (price < 0) {
            throw new RuntimeException("The price for the car cannot be negative!");
        }
        this.price = price;

        this.consumption = 9.6;
        this.isElectric = false;
        this.hasSunroof = false;
        this.options = new ArrayList<>();
    }

    @Override
    public Car build() {
        return new Car(brand, model, color, year, hp, price, consumption, isElectric, hasSunroof, options);
    }
}
