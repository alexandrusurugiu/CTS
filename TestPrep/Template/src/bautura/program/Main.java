package bautura.program;

import bautura.clase.Bautura;
import bautura.clase.Cafea;
import bautura.clase.Ceai;
import bautura.clase.Cocktail;

public class Main {
    public static void main(String[] args) {
        Bautura bautura = new Ceai();
        System.out.println("======Ceai======");
        bautura.pregateste();

        bautura = new Cafea();
        System.out.println("\n======Cafea======");
        bautura.pregateste();

        bautura = new Cocktail();
        System.out.println("\n======Cocktail======");
        bautura.pregateste();
    }
}