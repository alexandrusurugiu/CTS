package clase;

import java.util.ArrayList;
import java.util.List;

public class FiltrareMedieExamen extends Filtrare{
    @Override
    public List<Candidat> filter(List<Candidat> lista) {
        //se accepta doar candidatii cu medie examen mai mare de 7
        List<Candidat> candidatiFiltrati = new ArrayList<>();
        for (Candidat c : lista) {
            if (c.getMedieExamen() > 8) {
                candidatiFiltrati.add(c);
            }
        }

        System.out.println("S-a filtrat dupa medie examen. Au ramas " + candidatiFiltrati.size() + " candidati.");
        if (this.nextHandler != null) {
            return nextHandler.filter(candidatiFiltrati);
        } else {
            return candidatiFiltrati;
        }
    }
}
