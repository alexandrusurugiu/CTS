package clase.vehicle;

public class Bike implements IVehicle {
    private int speed;

    public Bike(int speed) {
        this.speed = speed;
    }

    @Override
    public void deliver() {
        System.out.println("Livrare cu BICICLETA (" + speed + " km/h)");
    }
}
