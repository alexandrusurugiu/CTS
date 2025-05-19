package chain_of_responsibility.clase;

import strategy.IStrategy;

import java.util.ArrayList;
import java.util.List;

public class Admitere {
    public List<Candidat> candidati = new ArrayList<>();
    private Filtrare filtrare1;
    private Filtrare filtrare2;
    private Filtrare filtrare3;
    private IStrategy strategieCurenta;

    public void setStrategie(IStrategy strategie) {
        this.strategieCurenta = strategie;
    }

    public Admitere(Filtrare filtrare1, Filtrare filtrare2, Filtrare filtrare3) {
        this.filtrare1 = filtrare1;
        this.filtrare2 = filtrare2;
        this.filtrare3 = filtrare3;

        setListaResponsabili();
    }

    public void addCandidat(Candidat c) {
        this.candidati.add(c);
    }

    private void setListaResponsabili() {
        filtrare1.setNextHandler(filtrare2);
        filtrare2.setNextHandler(filtrare3);
    }

    //pentru filtrarea pe lista noua
//    public void startAdmitere() {
//        List<Candidat> listaFiltrata = filtrare1.filter(this.candidati);
//        System.out.println("Dupa filtarre, lista finala a candidatilor admisi este:");
////        for (Candidat c : listaFiltrata) {
////            System.out.println(c);
////        }
//
//        if (this.strategieCurenta != null) {
//            strategieCurenta.afisareCandidati(listaFiltrata);
//        }
//    }

    //pentru filtrarea pe lista initiala
    public void startAdmitere() {
        filtrare1.filter(this.candidati); // Modifică lista originală

        System.out.println("Dupa filtrare, lista finala a candidatilor admisi este:");
        if(this.strategieCurenta != null) {
            strategieCurenta.afisareCandidati(this.candidati);
        }
    }
}
