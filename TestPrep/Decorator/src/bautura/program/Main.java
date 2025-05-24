package bautura.program;

import bautura.clase.Bautura;
import bautura.clase.Cafea;
import bautura.clase.DecoratorLapte;
import bautura.clase.DecoratorZahar;

public class Main {
    public static void main(String[] args) {
        Bautura bautura = new Cafea();
        System.out.println("Cafeaua comandata: " + bautura.getDescriere());
        System.out.println("Pretul cafelei: " + bautura.getCost());

        Bautura bautura2 = new DecoratorLapte(bautura);
        System.out.println("\nCafeaua comandata: " + bautura2.getDescriere());
        System.out.println("Pretul cafelei: " + bautura2.getCost());

        Bautura bautura3 = new DecoratorZahar(bautura2);
        System.out.println("\nCafeaua comandata: " + bautura3.getDescriere());
        System.out.println("Pretul cafelei: " + bautura3.getCost());
    }
}
