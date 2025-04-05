package clase;

import java.util.ArrayList;
import java.util.List;

public class AtacantFactory implements IFactory {

    private static Atacant atacant = new Atacant("Ion", 14, new ArrayList<String>(List.of("algocalmin", "nurofen")), new ArrayList<String>(List.of("Joc de glezne")));

    @Override
    public Jucator creeazaJucator() throws CloneNotSupportedException {
        return atacant.clone();
    }
}
