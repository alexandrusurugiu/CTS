package fisier.clase;

import java.util.HashSet;
import java.util.Set;

public class Fisier implements IFisier {
    private String nume;
    private Set<String> permisiuniEditare = new HashSet<>();

    @Override
    public void deschide(String user) {
        System.out.println(user + " a deschis fisierul " + nume);
    }

    @Override
    public void editeaza(String user) {
        if (permisiuniEditare.contains(user)) {
            System.out.println(user + " a editat fisierul " + nume);
        } else {
            throw new SecurityException("Nu ai permisiunea necesara!");
        }
    }

    public Fisier(String nume, Set<String> permisiuniEditare) {
        this.nume = nume;
        this.permisiuniEditare = permisiuniEditare;
    }
}
