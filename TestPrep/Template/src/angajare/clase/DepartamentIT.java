package angajare.clase;

public class DepartamentIT extends ProcesAngajare {
    @Override
    protected void evalueazaCV() {
        System.out.println("Se verifica proiectele detinute...");
    }

    @Override
    protected void interviu() {
        System.out.println("Se testeaza cunostintele despre structurile de date...");
    }
}
