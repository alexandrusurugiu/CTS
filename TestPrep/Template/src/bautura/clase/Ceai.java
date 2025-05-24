package bautura.clase;

public class Ceai extends Bautura {
    @Override
    public void adaugaIngredientPrincipal() {
        System.out.println("Se adauga ceaiul de fucte de padure...");
    }

    @Override
    public void adaugaCondimente() {
        System.out.println("Se adauga lamaie...");
    }
}
