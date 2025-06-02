package joc.clase;

public abstract class Joc {
    public final void initializeazaJoc() {
        incarcaResurse();
        setupHarta();
        setupCaractere();
        start();
    }

    private void start() {
        System.out.println("Jocul a pornit!");
    }

    private void incarcaResurse() {
        System.out.println("Se incarca resursele...");
    }

    protected abstract void setupHarta();
    protected abstract void setupCaractere();
}
