package club_sportiv.clase;

import java.util.ArrayList;

public class GestiuneAntrenori {
    private ArrayList<Antrenor> antrenori;

    public GestiuneAntrenori() {
        antrenori = new ArrayList<>();
    }

    public void addAntrenor(Antrenor antrenor) {
        antrenori.add(antrenor);
    }

    public ArrayList<Antrenor> getAntrenori() {
        return antrenori;
    }
}
