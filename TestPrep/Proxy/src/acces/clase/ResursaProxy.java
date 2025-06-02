package acces.clase;

import java.util.Arrays;
import java.util.List;

public class ResursaProxy implements IResursa {
    private Resursa resursa;
    private List<String> users = Arrays.asList("admin");

    public ResursaProxy(Resursa resursa) {
        this.resursa = resursa;
    }

    @Override
    public void acceseaza(String utilizator) {
        if (resursa == null) {
            throw new NullPointerException("There is no resource given!");
        } else {
            if (users.contains(utilizator)) {
                System.out.println("\n[LOG] Access granetd for " + utilizator);
                resursa.acceseaza(utilizator);
            } else {
                System.out.println("\n[LOG] Access denied for " + utilizator);
            }
        }
    }
}
