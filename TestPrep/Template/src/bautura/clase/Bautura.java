package bautura.clase;

public abstract class Bautura {
    public final void pregateste() {
        fierbeApa();
        adaugaIngredientPrincipal();
        adaugaCondimente();
        serveste();
    }

    private void serveste() {
        System.out.println("Bautura este gata pentru a fi servita");
    }

    private void fierbeApa() {
        System.out.println("Se fierbe apa...");
    }

    protected abstract void adaugaIngredientPrincipal();
    protected abstract void adaugaCondimente();
}
