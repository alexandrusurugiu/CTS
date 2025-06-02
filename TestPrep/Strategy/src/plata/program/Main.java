package plata.program;

import plata.clase.Plata;
import plata.clase.ProcesarePlati;
import plata.clase.StrategiePlataCard;
import plata.clase.StrategiePlataPayPal;

public class Main {
    public static void main(String[] args) {
        Plata plata = new Plata(2000, "RON");
        Plata plata2 = new Plata(1237, "EUR");
        Plata plata3 = new Plata(50000, "BTC");
        Plata plata4 = new Plata(500, "PLN");

        ProcesarePlati procesare = new ProcesarePlati();
        procesare.setStrategie(new StrategiePlataCard());
        procesare.seteazaMetodaPlata(plata);
        procesare.seteazaMetodaPlata(plata2);

        procesare.setStrategie(new StrategiePlataPayPal());
        procesare.seteazaMetodaPlata(plata3);
        procesare.seteazaMetodaPlata(plata4);
    }
}
