package adapter.clase;

public class CalculReducereEmag implements ICalculReducere {
    @Override
    public double getReducere(Client client) {
        System.out.println("Evaluare discount de catre EMAG");
        if (client.getTotalAchizitii() > 1000) {
            return 0.1;
        } else if (client.getTotalAchizitii() > 500) {
            return 0.05;
        }
        return 0;
    }
}
