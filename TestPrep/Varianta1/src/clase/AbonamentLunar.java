package clase;

public class AbonamentLunar implements AbstractMembership {
    private volatile static AbonamentLunar instance;
    private String nume;
    private int pret;
    private String categorie;

    public String getNume() {
        return nume;
    }

    private void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    private void setPret(int pret) {
        this.pret = pret;
    }

    public String getCategorie() {
        return categorie;
    }

    private void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    private AbonamentLunar() {
        this.nume = "Netflix";
        this.pret = 13;
        this.categorie = "Streaming video";
    }

    public synchronized static AbonamentLunar getInstance() {
        if (instance == null) {
            instance = new AbonamentLunar();
        }

        return instance;
    }

    @Override
    public void afiseazaAbonament() {
        System.out.println("Abonamentul familiei este pentru aplicatia: " + nume);
    }
}
