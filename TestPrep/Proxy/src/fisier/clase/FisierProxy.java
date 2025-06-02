package fisier.clase;

import java.util.Set;

public class FisierProxy implements IFisier {
    private Fisier fisier;
    private String nume;
    private Set<String> permisiuniEditare;

    public FisierProxy(String nume, Set<String> permisiuniEditare) {
        this.nume = nume;
        this.permisiuniEditare = permisiuniEditare;
    }

    @Override
    public void deschide(String user) {
        if (fisier == null) {
            fisier = new Fisier(nume, permisiuniEditare);
        }

        fisier.deschide(user);
    }

    @Override
    public void editeaza(String user) {
        if (permisiuniEditare.contains(user)) {
            fisier.editeaza(user);
        } else {
            System.out.println("Acces respins: " + user + " nu poate edita " + nume);
        }
    }
}
