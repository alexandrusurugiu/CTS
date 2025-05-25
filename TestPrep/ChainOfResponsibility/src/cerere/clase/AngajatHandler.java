package cerere.clase;

public class AngajatHandler extends BaseCerereHandler {
private static final double LIMITA = 1000;

    @Override
    public void proccessCerere(Cerere cerere) {
        if (cerere.getSuma() <= LIMITA) {
            System.out.println("\nThe employee approved the request: " + cerere.getDescriere());
        } else {
            System.out.println("\nThe employee couldn't approve the request. Moving forward...");
            passToNext(cerere);
        }
    }
}
