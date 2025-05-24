package document.clase;

public class User {
    private String nume;
    private int nivelAcces;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNivelAcces() {
        return nivelAcces;
    }

    public void setNivelAcces(int nivelAcces) {
        this.nivelAcces = nivelAcces;
    }

    public User(String nume, int nivelAcces) {
        this.nume = nume;
        this.nivelAcces = nivelAcces;
    }

    @Override
    public String toString() {
        return "User{" +
                "nume='" + nume + '\'' +
                ", nivelAcces=" + nivelAcces +
                '}';
    }
}
