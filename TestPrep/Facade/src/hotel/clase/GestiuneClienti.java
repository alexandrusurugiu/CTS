package hotel.clase;

import java.util.ArrayList;

public class GestiuneClienti {
    private ArrayList<Client> clienti = new ArrayList<>();

    public void adaugaClient(Client c) {
        clienti.add(c);
    }

    public boolean esteClientInregistrat(String nume) {
        for (Client c : clienti) {
            if (c.getNume().equalsIgnoreCase(nume)) {
                return true;
            }
        }
        return false;
    }
}
