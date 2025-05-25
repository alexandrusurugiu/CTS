package clase;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Comanda> comenzi;
    private String nume;

    public List<Comanda> getComenzi() {
        return comenzi;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Client(String nume) {
        this.nume = nume;
        this.comenzi = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Client{" +
                "comenzi=" + comenzi +
                ", nume='" + nume + '\'' +
                '}';
    }

    void addComanda(Comanda comanda) {
        this.comenzi.add(comanda);
    }
}
