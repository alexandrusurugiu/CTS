package meniuri.program;


import meniuri.clase.MeniuRestaurant;
import meniuri.clase.OfertaMeniu;
import meniuri.clase.StrategieCaloriiMinim;
import meniuri.clase.StrategieCarbohidratiMinim;

public class Main {
    public static void main(String[] args) {
        MeniuRestaurant meniu = new MeniuRestaurant();

        OfertaMeniu meniu1 = new OfertaMeniu("Meniu1", 750, 70);
        OfertaMeniu meniu2 = new OfertaMeniu("Meniu2", 500, 80);
        OfertaMeniu meniu3 = new OfertaMeniu("Meniu3", 650, 20);
        OfertaMeniu meniu4 = new OfertaMeniu("Meniu4", 800, 90);

        meniu.addOfertaMeniu(meniu1);
        meniu.addOfertaMeniu(meniu2);
        meniu.addOfertaMeniu(meniu3);
        meniu.addOfertaMeniu(meniu4);

        meniu.setStrategieAlegere(new StrategieCaloriiMinim());
        System.out.println("Meniu cu minim de calorii: " + meniu.alegereOferta());

        meniu.setStrategieAlegere(new StrategieCarbohidratiMinim());
        System.out.println("Meniu cu minim de carbohidrati: " + meniu.alegereOferta());
    }
}