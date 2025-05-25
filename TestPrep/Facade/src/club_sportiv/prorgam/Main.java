package club_sportiv.prorgam;

import club_sportiv.clase.*;

public class Main {
    public static void main(String[] args) {
        String dataCautata = "2025-06-15";

        GestiuneTerenuri gestiuneTerenuri = new GestiuneTerenuri();
        gestiuneTerenuri.addTeren(new TerenSport("Fotbal", 2));
        gestiuneTerenuri.addTeren(new TerenSport("Tenis", 10));
        gestiuneTerenuri.addTeren(new TerenSport("Baschet", 5));

        GestiuneAntrenori gestiuneAntrenori = new GestiuneAntrenori();
        gestiuneAntrenori.addAntrenor(new Antrenor("Popescu"));
        gestiuneAntrenori.addAntrenor(new Antrenor("Ionescu"));

        boolean terenuriDisponibile = FacadeClubSportiv.verificaDisponibilitateTerenuri(gestiuneTerenuri, 3, dataCautata);
        boolean antrenoriDisponibili = FacadeClubSportiv.verificaDisponibilitateAntrenori(gestiuneAntrenori, dataCautata);

        if (terenuriDisponibile && antrenoriDisponibili) {
            System.out.println("Rezervarea poate fi efectuata pentru data de " + dataCautata);
        } else {
            System.out.println("Rezervarea NU poate fi efectuata pentru data de " + dataCautata);
        }
    }
}
