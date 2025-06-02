package joc.clase;

public class JocRPG extends Joc {
    @Override
    protected void setupHarta() {
        System.out.println("Se configureaza china antica");
    }

    @Override
    protected void setupCaractere() {
        System.out.println("Se creeaza NPC-urile...");
    }
}
