package testing;

import models.Decoratiune;
import models.Magazin;
import models.PodeaPersonalizata;

public class Main {
    public static void main(String[] args) {
        try {
            Magazin magazin1 = new Magazin.Builder("Fashion Store", 200).setNumarIntrari(2).build();
            Magazin magazin2 = new Magazin.Builder("Luxury Boutique", 150).setPodea(new PodeaPersonalizata(3))
                    .addDecoratiune(new Decoratiune("Vitrina", "Sticla")).build();
            Magazin magazin3 = new Magazin.Builder("Soft Store", 100).setPodea(new PodeaPersonalizata(1))
                    .addDecoratiune(new Decoratiune("Lampă", "Plastic")).build();
            Magazin magazin4 = new Magazin.Builder("Wine store", 50).setNumarIntrari(1).build();

            System.out.println(magazin1);
            System.out.println(magazin2);
            System.out.println(magazin3);
            System.out.println(magazin4);

        } catch (Exception e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
