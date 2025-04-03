package test;


import clase.Ospatar;
import clase.Restaurant;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //===========Simple Singleton Method===========

        Ospatar ospatar = new Ospatar(1, "Gigel");
        Ospatar ospatar2 = new Ospatar(2, "Ionescu");

        Restaurant r1 = new Restaurant("Mc Donalds");
        Restaurant r2 = new Restaurant("Mc Romana");

        r1.addOspatari(ospatar);
        r1.addOspatari(ospatar);
        r2.addOspatari(ospatar2);

        //motivul pentru care sunt afisati 2 ospatari este acela ca r1 si r2 sunt practic aceeasi instanta, doar ca au nume diferite
        //adaugand in lista de ospatari ospatar si ospatar2, practic se adauga amandoi in lista primului restaurant
        System.out.println(r1);
        System.out.println(r2);


        //===========Thread Safe Method===========

        //initializare singleton pentru thread safe
        final Restaurant[] r3 = new Restaurant[1];
        final Restaurant[] r4 = new Restaurant[1];

        //Aici se initializeaza instanta restaurantului in singura "partitie" disponibila a acelui array declarat mai sus
        Thread t1 = new Thread(() -> r3[0] = Restaurant.getInstance());
        Thread t2 = new Thread(() -> r4[0] = Restaurant.getInstance());

        //aici punem threadurile la treaba ca pe sclavi
        t1.start();
        t2.start();

        //asta inseamna ca programul nu trece de linia asta pana cand nu se termina de executat ce e in thread
        t1.join();
        t2.join();

        r3[0].addOspatari(ospatar);
        r4[0].addOspatari(ospatar2);

        System.out.println(r3[0]);
    }
}