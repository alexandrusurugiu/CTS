package clase.jucator;

import java.util.List;

public class Atacant extends Jucator {
    Atacant(String name, int varsta, List<String> medicamente, List<String> antrenamente) {
        super(name, varsta, medicamente, antrenamente);
    }

    @Override
    public void afisezaDetalii() {
        System.out.println("Atacant");
    }
}
