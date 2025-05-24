package angajare.clase;

public abstract class ProcesAngajare {
    public final void deruleazaProces() {
        posteazaAnunt();
        evalueazaCV();
        interviu();
        oferta();
    }

    private void posteazaAnunt() {
        System.out.println("Anuntul este postat!");
    }

    private void oferta() {
        System.out.println("Oferta este trimisa!");
    }

    protected abstract void evalueazaCV();
    protected abstract void interviu();
}
