package angajare.clase;

public class DepartamentVanzari extends ProcesAngajare {
    @Override
    protected void evalueazaCV() {
        System.out.println("Se verifica experienta in vanzari...");
    }

    @Override
    protected void interviu() {
        System.out.println("Se desfasoara interviul de comportament...");
    }
}
