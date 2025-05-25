package hotel.program;

import hotel.clase.*;

public class Main {
    public static void main(String[] args) {
        String dataDorita = "2025-07-10";

        GestiuneCamere gestiuneCamere = new GestiuneCamere();
        gestiuneCamere.adaugaCamera(new Camera(101, "Single"));
        gestiuneCamere.adaugaCamera(new Camera(102, "Double"));
        gestiuneCamere.adaugaCamera(new Camera(201, "Suite"));

        GestiuneClienti gestiuneClienti = new GestiuneClienti();
        gestiuneClienti.adaugaClient(new Client("Popescu Andrei"));
        gestiuneClienti.adaugaClient(new Client("Ionescu Maria"));

        Client clientNou = new Client("Georgescu Vlad");

        boolean disponibil = FacadeHotel.verificaDisponibilitate(gestiuneCamere, gestiuneClienti, clientNou, dataDorita);

        if (disponibil) {
            System.out.println("Rezervarea a fost efectuata cu succes pentru " + clientNou.getNume() + " pe data de " + dataDorita);
        } else {
            System.out.println("Nu exista camere disponibile pentru data de " + dataDorita + " sau clientul este deja inregistrat.");
        }
    }
}
