package test;

import clase.magazin.Magazin;
import clase.magazin.MagazinBuilder;

public class MagazinMain {
    public static void main(String[] args) {
        MagazinBuilder builder = new MagazinBuilder("MegaMall", 200);

        Magazin m = builder.setPodeaPersonalizata(true).setDuritatePodea(3).addDecoratiuni("Lampa").setNumarIntrari(2).build();
        Magazin m2 = builder.setNumarIntrari(2).addDecoratiuni("sticla").setPodeaPersonalizata(true).setDuritatePodea(2).build();

        System.out.println(m);
        System.out.println(m2);
    }
}