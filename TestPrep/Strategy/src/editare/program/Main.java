package editare.program;

import editare.clase.Strategie;
import editare.clase.StrategieAlbNegru;
import editare.clase.StrategieContrast;
import editare.clase.StrategieSepia;

public class Main {
    public static void main(String[] args) {
        Strategie strategie = new Strategie();

        strategie.setFiltruImagine(new StrategieAlbNegru());
        System.out.println("======Black & White======");
        strategie.proceseazaImagine("Hansel and Grettel");

        strategie.setFiltruImagine(new StrategieSepia());
        System.out.println("\n======Sepia======");
        strategie.proceseazaImagine("Alice in Wonderland");

        strategie.setFiltruImagine(new StrategieContrast());
        System.out.println("\n======Contrast======");
        strategie.proceseazaImagine("Venus");
    }
}
