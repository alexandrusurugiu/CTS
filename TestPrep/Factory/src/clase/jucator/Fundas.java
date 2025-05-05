package clase.jucator;

import java.util.List;

public class Fundas extends Jucator {
    Fundas(String name, int varsta, List<String> medicamente, List<String> antrenamente) {
        super(name, varsta, medicamente, antrenamente);
    }

    @Override
    public void afisezaDetalii() {
        System.out.println("Fundas");
    }
}
