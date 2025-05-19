package chain_of_responsibility.clase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FiltrareEseu extends Filtrare {

    //filtrare pe lista noua
//    @Override
//    public List<Candidat> filter(List<Candidat> lista) {
//        //se accepta doar candidatii cu eseul de lungime para
//        List<Candidat> candidatiFiltrati = new ArrayList<>();
//        for (Candidat c : lista) {
//            if (c.getEseu().length() % 2 == 0) {
//                candidatiFiltrati.add(c);
//            }
//        }
//
//        System.out.println("S-a filtrat dupa eseu. Au ramas " + candidatiFiltrati.size() + " candidati.");
//        if (this.nextHandler != null) {
//            return nextHandler.filter(candidatiFiltrati);
//        } else {
//            return candidatiFiltrati;
//        }
//    }

    //filtrare pe lista initiala
    @Override
    public void filter(List<Candidat> lista) {
        Iterator<Candidat> iterator = lista.iterator();
        while(iterator.hasNext()) {
            Candidat c = iterator.next();
            if(c.getEseu().length() % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println("S-a filtrat dupa eseu. Au ramas " + lista.size() + " candidati.");
        if(this.nextHandler != null) {
            nextHandler.filter(lista);
        }
    }
}
