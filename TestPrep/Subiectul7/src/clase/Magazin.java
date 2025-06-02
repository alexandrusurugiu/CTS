package clase;

public class Magazin implements IMagazin {
    private String nume;

    @Override
    public void plaseazaComanda(Client client, Comanda comanda) {
        client.addComanda(comanda);
    }

    public Magazin(String nume) {
        this.nume = nume;
    }
}
