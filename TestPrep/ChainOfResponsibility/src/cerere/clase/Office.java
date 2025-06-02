package cerere.clase;

public class Office {
    private BaseCerereHandler angajatHandler;
    private BaseCerereHandler managerHandler;
    private BaseCerereHandler directorHandler;

    public Office(BaseCerereHandler angajatHandler, BaseCerereHandler managerHandler, BaseCerereHandler directorHandler) {
        this.angajatHandler = angajatHandler;
        this.managerHandler = managerHandler;
        this.directorHandler = directorHandler;

        this.angajatHandler.setNextHandler(managerHandler);
        this.managerHandler.setNextHandler(directorHandler);
    }

    public void startProccess(Cerere cerere) {
        this.angajatHandler.proccessCerere(cerere);
    }
}
