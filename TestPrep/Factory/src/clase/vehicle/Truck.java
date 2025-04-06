package clase.vehicle;

public class Truck implements IVehicle {
    private int maxWeight;

    public Truck(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void deliver() {
        System.out.println("Livrare cu CAMIONUL (max " + maxWeight + " kg)");
    }


}
