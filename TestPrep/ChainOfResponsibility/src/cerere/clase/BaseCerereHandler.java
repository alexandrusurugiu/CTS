package cerere.clase;

public abstract class BaseCerereHandler implements CerereHandler {
    private CerereHandler nextHandler;

    @Override
    public void setNextHandler(CerereHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void passToNext(Cerere cerere) {
        if (nextHandler != null) {
            nextHandler.proccessCerere(cerere);
        } else {
            System.out.println("No more superiors to evaluate the request.");
        }
    }
}
