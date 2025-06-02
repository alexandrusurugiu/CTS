package joc.clase;

public class JocShooter extends Joc {
    @Override
    protected void setupHarta() {
        System.out.println("Se incarca insula...");
    }

    @Override
    protected void setupCaractere() {
        System.out.println("de aloca armele pentru jucatori...");
    }
}
