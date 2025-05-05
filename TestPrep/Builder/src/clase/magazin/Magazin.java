package clase.magazin;

import java.util.List;

public class Magazin {
    private final String denumire;
    private final int suprafata;
    private final int numarIntrari;
    private final int duritatePodea;
    private final List<String> decoratiuni;

    Magazin(String denumire, int suprafata, int numarIntrari, int duritatePodea, List<String> decoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.numarIntrari = numarIntrari;
        this.duritatePodea = duritatePodea;
        this.decoratiuni = decoratiuni;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", numarIntrari=" + numarIntrari +
                ", duritatePodea=" + duritatePodea +
                ", decoratiuni=" + decoratiuni +
                '}';
    }
}
