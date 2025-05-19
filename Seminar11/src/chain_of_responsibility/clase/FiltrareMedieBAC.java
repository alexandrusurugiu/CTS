package chain_of_responsibility.clase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FiltrareMedieBAC extends Filtrare {

    //filtrare pe lista noua
//    @Override
//    public List<Candidat> filter(List<Candidat> lista) {
//        //se accepta doar candidatii cu medie BAC mai mare de 6
//        List<Candidat> candidatiFiltrati = new ArrayList<>();
//        for (Candidat c : lista) {
//            if (c.getMedieBac() > 6) {
//                candidatiFiltrati.add(c);
//            }
//        }
//
//        System.out.println("S-a filtrat dupa medie BAC. Au ramas " + candidatiFiltrati.size() + " candidati.");
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
            if(c.getMedieBac() <= 6) {
                iterator.remove();
            }
        }

        System.out.println("S-a filtrat dupa medie BAC. Au ramas " + lista.size() + " candidati.");
        if(this.nextHandler != null) {
            nextHandler.filter(lista);
        }
    }
}
