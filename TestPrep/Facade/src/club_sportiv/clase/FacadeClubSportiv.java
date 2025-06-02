package club_sportiv.clase;

public class FacadeClubSportiv {
    private static GestiuneTerenuri gestiuneTerenuri;
    private static GestiuneAntrenori gestiuneAntrenori;

    public static boolean verificaDisponibilitateTerenuri(GestiuneTerenuri terene, int nrTerene, String data) {
        int ct = 0;
        for (TerenSport teren : terene.getTerenuri()) {
            if (teren.verificaDisponibilitate(data)) {
                ct++;
            }
        }
        return ct >= nrTerene;
    }

    public static boolean verificaDisponibilitateAntrenori(GestiuneAntrenori antrenori, String data) {
        int ct = 0;
        for (Antrenor antrenor : antrenori.getAntrenori()) {
            if (antrenor.verificaDisponibilitate(data)) {
                ct++;
            }
        }
        return ct > 0;
    }
}
