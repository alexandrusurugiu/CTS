package club_sportiv.clase;

import java.util.ArrayList;

public class GestiuneTerenuri {
    private ArrayList<TerenSport> terenuri;

    public GestiuneTerenuri() {
        terenuri = new ArrayList<>();
    }

    public void addTeren(TerenSport teren) {
        terenuri.add(teren);
    }

    public TerenSport getTeren(int index) {
        return terenuri.get(index);
    }

    public int getNrTerenuri() {
        return terenuri.size();
    }

    public ArrayList<TerenSport> getTerenuri() {
        return terenuri;
    }
}
