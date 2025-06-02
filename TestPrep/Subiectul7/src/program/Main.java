package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ionescu");
        Client client2 = new Client("Popescu");
        Client client3 = new Client("Rusescu");

        Comanda comanda = new Comanda(50);
        Comanda comanda2 = new Comanda(110);
        Comanda comanda3 = new Comanda(34);

        comanda.addProdus("banane");
        comanda.addProdus("mere");
        comanda.addProdus("gutui");

        comanda2.addProdus("monitor");
        comanda2.addProdus("mouse");
        comanda2.addProdus("tastatura");

        comanda3.addProdus("bata");
        comanda3.addProdus("chibrit");
        comanda3.addProdus("casca");

        IMagazin magazin = new ProxyMagazin(new Magazin("eMag"));
        System.out.println("Comenzile lui: " + client.getNume());
        magazin.plaseazaComanda(client, comanda);
        magazin.plaseazaComanda(client, comanda2);
    }
}