package acces.program;

import acces.clase.Resursa;
import acces.clase.ResursaProxy;

public class Main {
    public static void main(String[] args) {
        Resursa resursa = new Resursa("condifential.txt");
        ResursaProxy proxy = new ResursaProxy(resursa);

        proxy.acceseaza("user");
        proxy.acceseaza("editor");
        proxy.acceseaza("admin");
    }
}
