package clase.vehicle;

public class VehicleFactory {
    public IVehicle createVehicle(String type) {
        switch (type) {
            case "truck":
                return new Truck(5000);
            case "bike":
                return new Bike(25);
            case "van":
                return new Van(5);
            default:
                throw new Error("Invalid vehicle type: " + type);
        }
    }
}
