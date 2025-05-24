package masina.program;

import masina.clase.*;

public class Main {
    public static void main(String[] args) {
        Masina masina = new MasinaRenault();
        System.out.println("Disponibil in stoc: " + masina.getDescriere() + " la pretul de " + masina.getCost());

        DecoratorMasina masina2 = new DecoratorAerConditionat(masina);
        System.out.println("\nDisponibil in stoc: " + masina2.getDescriere() + " la pretul de " + masina2.getCost());

        DecoratorXenon masina3 = new DecoratorXenon(masina2);
        System.out.println("\nDisponibil in stoc: " + masina3.getDescriere() + " la pretul de " + masina3.getCost());

    }
}
