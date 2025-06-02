package bautura.clase;

public class Cocktail extends Bautura {
    @Override
    public void adaugaIngredientPrincipal() {
        System.out.println("Se adauga fructul pasiunii...");
    }

    @Override
    public void adaugaCondimente() {
        System.out.println("Se adauga lemongrass, sirop si gheata...");
    }
}
