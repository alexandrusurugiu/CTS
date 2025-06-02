package pizza.clase;

public class PizzaVegetariana extends Pizza {
    @Override
    public String getComponents() {
        return "blat, sos rosii, ciuperci, ceapa";
    }

    @Override
    public int getPret() {
        return 27;
    }
}
