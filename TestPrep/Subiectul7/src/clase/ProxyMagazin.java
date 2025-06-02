package clase;

public class ProxyMagazin implements IMagazin {
    private Magazin magazin;

    public ProxyMagazin(Magazin magazin) {
        this.magazin = magazin;
    }


    @Override
    public void plaseazaComanda(Client client, Comanda comanda) {
        if (client.getComenzi().isEmpty()) {
            double discount = 0.10;
            comanda.setPret(comanda.getPret() * (1-discount));
            System.out.println("Pretul comenzii dupa discountul de 10%: " + comanda.getPret());
            magazin.plaseazaComanda(client, comanda);

        } else {
            System.out.println("Pretul comenzii fara discount: " + comanda.getPret());
            magazin.plaseazaComanda(client, comanda);
        }
    }
}
