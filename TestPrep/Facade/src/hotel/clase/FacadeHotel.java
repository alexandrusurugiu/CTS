package hotel.clase;

import java.util.List;

public class FacadeHotel {
    public static boolean verificaDisponibilitate(GestiuneCamere camere, GestiuneClienti clienti, Client client, String data) {
        if (clienti.esteClientInregistrat(client.getNume())) {
            return false;
        }

        for (Camera c : camere.getCamere()) {
            if (c.esteDisponibila(data)) {
                clienti.adaugaClient(client);
                return true;
            }
        }

        return false;
    }
}
