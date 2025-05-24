package plata.clase;

public class ProcesarePlati {
    IProcesarePlata strategie;

    public void setStrategie (IProcesarePlata strategie) {
        this.strategie = strategie;
    }

    public void seteazaMetodaPlata(Plata plata) {
        if (strategie != null) {
            strategie.proceseazaPlata(plata);
        }
    }
}
