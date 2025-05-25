package cerere.clase;

public interface CerereHandler {
    void setNextHandler(CerereHandler urmatorul);
    void proccessCerere(Cerere cerere);
}
