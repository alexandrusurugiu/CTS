package fisier.program;

import fisier.clase.Fisier;
import fisier.clase.FisierProxy;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> permisiuniEditare = new HashSet<>();
        permisiuniEditare.add("admin");
        permisiuniEditare.add("user");
        permisiuniEditare.add("manager");

        FisierProxy fisierProxy = new FisierProxy("raport.txt", permisiuniEditare);

        String[] utilizatori = {"guest", "editor", "admin", "hacker"};

        for (String user : utilizatori) {
            try {
                System.out.println("\n--- Test pentru utilizator: " + user + " ---");
                fisierProxy.deschide(user);
                fisierProxy.editeaza(user);
            } catch (Exception e) {
                System.out.println("Eroare: " + e.getMessage());
            }
        }
    }
}
