package clase.client;

public class EvaluareClientFirmaB implements IEvaluareClientFirmaB{

    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Tehnica evaluare firma B");
        System.out.println("S-a oferit un discount de 10%");
    }
}
