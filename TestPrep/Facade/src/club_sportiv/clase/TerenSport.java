package club_sportiv.clase;

import java.util.HashSet;
import java.util.Set;

public class TerenSport {
    private String tipTeren;
    private int capacitate;
    private Set<String> dateOcupate;

    public TerenSport(String tipTeren, int capacitate) {
        this.tipTeren = tipTeren;
        this.capacitate = capacitate;
        this.dateOcupate = new HashSet<>();
    }

    public boolean verificaDisponibilitate(String data) {
        return !dateOcupate.contains(data);
    }

    public void rezerva(String data) {
        if (verificaDisponibilitate(data)) {
            dateOcupate.add(data);
        }
    }

    public String getTipTeren() {
        return tipTeren;
    }

    public int getCapacitate() {
        return capacitate;
    }
}
