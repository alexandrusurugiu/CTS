package test;

import clase.car.Car;
import clase.car.CarBuilder;

public class CarMain {
    public static void main(String[] args) {
        Car car = new CarBuilder("Renault", "Megane RS", "Yellow", 2024, 14000).addOption("Toba Akrapovic").setHp(250).build();
        Car car2 = new CarBuilder("Mercedes", "A45 AMG", "White", 2016, 23045).setHp(356).setConsumption(14.2).addOption("Alcantara").build();

        System.out.println(car);
        System.out.println(car2);

        //crapa
        Car car3 = new CarBuilder("BMW", "M3", "Turquoise", 1999, 17500).build();
        Car car4 = new CarBuilder("Audi", "RS6", "Black", 2010, -20000).addOption("HR suspension").setHp(450).setConsumption(20).build();
    }
}
