package plata.clase;

public class StrategiePlataPayPal implements IProcesarePlata {
    @Override
    public boolean proceseazaPlata(Plata plata) {
        System.out.println("Redirectionare catre PayPal...");
        return !plata.getMoneda().equals("Bitcoin");
    }
}
