package cerere.clase;

public class DirectorHandler extends BaseCerereHandler {
    @Override
    public void proccessCerere(Cerere cerere) {
        System.out.println("The director approved the request: " + cerere.getDescriere());
    }
}
