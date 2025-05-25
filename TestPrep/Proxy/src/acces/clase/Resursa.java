package acces.clase;

public class Resursa implements IResursa {
    private String numeResursa;

    public Resursa(String numeResursa) {
        this.numeResursa = numeResursa;
    }

    @Override
    public void acceseaza(String utilizator) {
        System.out.println(utilizator + " has opened " + numeResursa);
    }
}
