package chain_of_responsibility.clase;

import java.util.Iterator;
import java.util.List;

public class FiltrareMedieExamen extends Filtrare{

    //filtarre pe lista noua
    //    @Override
//    public List<Candidat> filter(List<Candidat> lista) {
//        //se accepta doar candidatii cu medie examen mai mare de 7
//        List<Candidat> candidatiFiltrati = new ArrayList<>();
//        for (Candidat c : lista) {
//            if (c.getMedieExamen() > 8) {
//                candidatiFiltrati.add(c);
//            }
//        }
//
//        System.out.println("S-a filtrat dupa medie examen. Au ramas " + candidatiFiltrati.size() + " candidati.");
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
            if(c.getMedieExamen() <= 8) { // Corectat condiția conform cerinței inițiale
                iterator.remove();
            }
        }

        System.out.println("S-a filtrat dupa medie examen. Au ramas " + lista.size() + " candidati.");
        if(this.nextHandler != null) {
            nextHandler.filter(lista);
        }
    }
}
