package clase;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder implements IBuilder {
    private String denumire;
    private int suprafata;
    private int numarIntrari;
    private int duritatePodea;
    private boolean isPodeaPersonalizata;
    private List<String> decoratiuni;

    public MagazinBuilder setPodeaPersonalizata(boolean podeaPersonalizata) {
        isPodeaPersonalizata = podeaPersonalizata;
        return this;
    }

    public MagazinBuilder setNumarIntrari(int numarIntrari) {
        this.numarIntrari = numarIntrari;
        return this;
    }

    public MagazinBuilder setDuritatePodea(int duritatePodea) {
        if (isPodeaPersonalizata) {
            this.duritatePodea = duritatePodea;
        } else {
            throw new RuntimeException("Nu ai podea personalizata");
        }

        return this;
    }

    public MagazinBuilder addDecoratiuni(String decoratiuni) {
        this.decoratiuni.add(decoratiuni);
        return this;
    }

    public MagazinBuilder(String denumire, int suprafata) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.numarIntrari = 1;
        this.isPodeaPersonalizata = false;
        this.duritatePodea = 5;
        this.decoratiuni = new ArrayList<>();
    }

    @Override
    public Magazin build() {
        if (numarIntrari*100 < suprafata) {
            throw new RuntimeException("Nu pot exista mai putin de 1 intrari per 100 mp de magazin");
        }

        if (isPodeaPersonalizata && duritatePodea < 2 && decoratiuni.contains("sticla")) {
            throw new RuntimeException("Podea moale si sticla");
        }

        var m = new Magazin(denumire, suprafata, numarIntrari, duritatePodea, decoratiuni);
        this.decoratiuni = new ArrayList<>();
        return m;
    }
}
