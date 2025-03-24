package testing;

import clase.Aragaz;
import clase.LocatieMasa;
import clase.Masa;
import clase.Restaurant;

public class Main {
//    public static void main(String[] args) {
//        Restaurant restaurant1 = Restaurant.getInstance();
//        Restaurant restaurant2 = Restaurant.getInstance();
//
//        //avantajul este ca getInstance va intaorce unicul obiect de tip Restaurant
//        System.out.println("\n-------Verificare referinte-------");
//        if (restaurant1 == restaurant2) {
//            System.out.println("Cele doua referinte sunt identice");
//        } else {
//            System.out.println("Cele doua referinte sunt diferite");
//        }
//
//        restaurant1.addMasa(new Masa(1, LocatieMasa.AFARA, 4));
//        restaurant1.addMasa(new Masa(2, LocatieMasa.INAUNTRU, 6));
//        restaurant1.addMasa(new Masa(3, LocatieMasa.AFARA, 2));
//        restaurant1.addMasa(new Masa(4, LocatieMasa.INAUNTRU, 8));
//        restaurant2.addMasa(new Masa(5, LocatieMasa.AFARA, 3));
//
//        System.out.println("\n-------Lista mese-------");
//        System.out.println(restaurant1);
//
//        //utilizare singleton de catre opsatar
//        System.out.println("\n-------Verificare disponibilitate masa-------");
//        System.out.println(restaurant1.getMasa(LocatieMasa.AFARA, 2));
//    }

    public static void main(String[] args) {
        Aragaz aragaz = Aragaz.getInstance();
    }
}
