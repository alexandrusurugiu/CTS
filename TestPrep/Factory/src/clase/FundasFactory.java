package clase;

import java.util.ArrayList;
import java.util.List;

public class FundasFactory implements IFactory {
    private static Fundas fundas = new Fundas("Gigel", 20, new ArrayList<String>(List.of("aspirina", "paracetamol")), new ArrayList<String>(List.of("Mersu piticului")));

    @Override
    public Jucator creeazaJucator() throws CloneNotSupportedException {
        return fundas.clone();
    }
}
