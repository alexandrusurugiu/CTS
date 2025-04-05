package clase.car;

import java.util.List;

public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int year;
    private final int hp;
    private final double price;
    private final double consumption;
    private final boolean isElectric;
    private final boolean hasSunroof;
    private final List<String> options;

    Car(String brand, String model, String color, int year, int hp, double price, double consumption, boolean isElectric, boolean hasSunroof, List<String> options) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.hp = hp;
        this.price = price;
        this.consumption = consumption;
        this.isElectric = isElectric;
        this.hasSunroof = hasSunroof;
        this.options = options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", hp=" + hp +
                ", price=" + price +
                ", consumption=" + consumption +
                ", isElectric=" + isElectric +
                ", hasSunroof=" + hasSunroof +
                ", options=" + options +
                '}';
    }
}
