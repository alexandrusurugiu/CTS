package plata.clase;

public class StrategiePlataCard implements IProcesarePlata {
    @Override
    public boolean proceseazaPlata(Plata plata) {
        System.out.println("Procesare card pentru " + plata.getSuma() + " " + plata.getMoneda());
        return true;
    }
}
