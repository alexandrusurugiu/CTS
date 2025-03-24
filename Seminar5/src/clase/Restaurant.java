package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static Restaurant instance; // = new Restaurant(); - metoda eager
    //singleton data (non-static) - se refera la datele pe care le care singleton-ul

    private List<Masa> listaMese;
    private String denumire;

    private Restaurant(String denumire) {
        this.listaMese = new ArrayList<>();
        this.denumire = denumire;
    }

    //Accesam instanta noastra, adica unicul obiect
    //Evitam folosirea parametrilor in getInstance pentur ca se ajunge sa avem mai multe instante
    public static Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant(null);    // metoda lazy
        }
        return instance;
    }

    //singleton methods + operations
    public Masa getMasa(LocatieMasa locatie, int nrPersoane) {
         for (Masa masa : listaMese) {
             if (masa.getNrScaune() >= nrPersoane && masa.getLocatie() == LocatieMasa.AFARA) {
                 return masa;
             }
         }

         return null;
    }

    public void addMasa(Masa masa) {
        listaMese.add(masa);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "listaMese=" + listaMese +
                '}';
    }
}
