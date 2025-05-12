package clase;

import java.util.ArrayList;
import java.util.List;

public class FiltrareEseu extends Filtrare {

    @Override
    public List<Candidat> filter(List<Candidat> lista) {
        //se accepta doar candidatii cu eseul de lungime para
        List<Candidat> candidatiFiltrati = new ArrayList<>();
        for (Candidat c : lista) {
            if (c.getEseu().length() % 2 == 0) {
                candidatiFiltrati.add(c);
            }
        }

        System.out.println("S-a filtrat dupa eseu. Au ramas " + candidatiFiltrati.size() + " candidati.");
        if (this.nextHandler != null) {
            return nextHandler.filter(candidatiFiltrati);
        } else {
            return candidatiFiltrati;
        }
    }
}
