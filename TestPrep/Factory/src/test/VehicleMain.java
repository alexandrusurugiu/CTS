package test;

import clase.vehicle.IVehicle;
import clase.vehicle.VehicleFactory;

public class VehicleMain {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        IVehicle vehicle = null;

        try {
            vehicle = factory.createVehicle("bike");
        } catch (Exception e) {
            e.printStackTrace();
        }

        vehicle.deliver();

        try {
            vehicle = factory.createVehicle("van");
        } catch (Exception e) {
            e.printStackTrace();
        }
        vehicle.deliver();
    }
}
