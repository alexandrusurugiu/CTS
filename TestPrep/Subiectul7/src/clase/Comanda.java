package clase;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private List<String> produse;
    private double pret;

    public List<String> getProduse() {
        return produse;
    }

    public void addProdus(String produs) {
        this.produse.add(produs);
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public Comanda(int pret) {
        this.produse = new ArrayList<>();
        this.pret = pret;
    }
}
