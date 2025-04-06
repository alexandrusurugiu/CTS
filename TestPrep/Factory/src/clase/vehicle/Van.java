package clase.vehicle;

public class Van implements IVehicle {
    private int volum;

    public Van(int volum) {
        this.volum = volum;
    }

    @Override
    public void deliver() {
        System.out.println("Livrare cu DUBA (volum " + volum + "m3)");
    }
}
