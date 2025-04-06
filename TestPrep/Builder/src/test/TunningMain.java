package test;

import clase.tunning.Masina;
import clase.tunning.MasinaBuilder;

public class TunningMain {
    public static void main(String[] args) {
        Masina m1 = new MasinaBuilder("Mercedes", "A45 AMG", "trapa").setAn(2018).setHasCustomChairs(true).setChairs("alcantara").build();
        Masina m2 = new MasinaBuilder("BMW", "M6", "Adaptive LED Lights").setHasCustomInterior(true).setInterior("alb").setHasCustomDoors(true).setDoors("carbon").build();

        System.out.println(m1);
        System.out.println(m2);

        //crapa
        Masina m3 = new MasinaBuilder("Audi", "R8", "").setHasCustomChairs(true).build();
        System.out.println(m3);
    }
}
