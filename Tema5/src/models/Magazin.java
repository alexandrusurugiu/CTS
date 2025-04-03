package models;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private final String denumire;
    private final int suprafata;
    private final int numarIntrari;
    private final Podea podea;
    private final List<Decoratiune> decoratiuni;

    private Magazin(Builder builder) {
        this.denumire = builder.denumire;
        this.suprafata = builder.suprafata;
        this.numarIntrari = builder.numarIntrari;
        this.podea = builder.podea;
        this.decoratiuni = builder.decoratiuni;
    }

    public static class Builder {
        private final String denumire;
        private final int suprafata;
        private int numarIntrari = 1;
        private Podea podea = new PodeaStandard();
        private List<Decoratiune> decoratiuni = new ArrayList<>();

        public Builder(String denumire, int suprafata) {
            if (suprafata < 100) {
                throw new IllegalArgumentException("Suprafata trebuie să fie de minim 100 mp");
            }
            this.denumire = denumire;
            this.suprafata = suprafata;
        }

        public Builder setNumarIntrari(int numarIntrari) {
            if (numarIntrari < suprafata / 100) {
                throw new IllegalArgumentException("Numar insuficient de intrari pentru suprafața magazinului");
            }
            this.numarIntrari = numarIntrari;
            return this;
        }

        public Builder setPodea(Podea podea) {
            this.podea = podea;
            return this;
        }

        public Builder addDecoratiune(Decoratiune decoratiune) {
            if (podea instanceof PodeaPersonalizata && ((PodeaPersonalizata) podea).getDuritate() < 2 && decoratiune.getMaterial().equals("Sticla")) {
                throw new IllegalArgumentException("Podeaua moale nu permite decorațiuni din sticla");
            }
            this.decoratiuni.add(decoratiune);
            return this;
        }

        public Magazin build() {
            return new Magazin(this);
        }
    }

    @Override
    public String toString() {
        return "Magazin: " + denumire + ", Suprafata: " + suprafata + " mp, Intrari: " + numarIntrari + ", Podea: " + podea + ", Decoratiuni: " + decoratiuni;
    }
}
