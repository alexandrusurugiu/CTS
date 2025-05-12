package clase;

import java.util.ArrayList;
import java.util.List;

public class FiltrareMedieBAC extends Filtrare {

    @Override
    public List<Candidat> filter(List<Candidat> lista) {
        //se accepta doar candidatii cu medie BAC mai mare de 6
        List<Candidat> candidatiFiltrati = new ArrayList<>();
        for (Candidat c : lista) {
            if (c.getMedieBac() > 6) {
                candidatiFiltrati.add(c);
            }
        }

        System.out.println("S-a filtrat dupa medie BAC. Au ramas " + candidatiFiltrati.size() + " candidati.");
        if (this.nextHandler != null) {
            return nextHandler.filter(candidatiFiltrati);
        } else {
            return candidatiFiltrati;
        }
    }
}
