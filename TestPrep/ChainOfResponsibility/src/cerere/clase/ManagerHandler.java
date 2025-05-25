package cerere.clase;

public class ManagerHandler extends BaseCerereHandler {
    private static final double LIMIT = 5000;

    @Override
    public void proccessCerere(Cerere cerere) {
        if (cerere.getSuma() <= 5000) {
            System.out.println("The manager has approved the request: " + cerere.getDescriere());
        } else {
            System.out.println("The manager couldn't approve the request. Moving forward...");
            passToNext(cerere);
        }
    }
}
