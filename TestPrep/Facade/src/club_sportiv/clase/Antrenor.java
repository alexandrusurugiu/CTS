package club_sportiv.clase;

import java.util.HashSet;
import java.util.Set;

public class Antrenor {
    private String nume;
    private Set<String> dateOcupate;

    public Antrenor(String nume) {
        this.nume = nume;
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

    public String getNume() {
        return nume;
    }
}
