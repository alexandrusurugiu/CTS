package strategy;

import chain_of_responsibility.clase.Candidat;

import java.util.List;

public class StartegyNoGDPR implements IStrategy {
    @Override
    public void afisareCandidati(List<Candidat> candidati) {
        for (Candidat c : candidati) {
            System.out.println(c.getName() + " " +c.getMedieBac());
        }
    }
}
