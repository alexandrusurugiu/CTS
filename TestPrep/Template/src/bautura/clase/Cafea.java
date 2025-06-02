package bautura.clase;

public class Cafea extends Bautura {
    @Override
    public void adaugaIngredientPrincipal() {
        System.out.println("Se adauga cafea africana...");
    }

    @Override
    public void adaugaCondimente() {
        System.out.println("Se adauga zahar...");
    }
}
