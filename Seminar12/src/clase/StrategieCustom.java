package clase;

import java.util.Scanner;

public class StrategieCustom implements IClient{

    //Se folosesc bancnotele cerute de client prin scanner
    private boolean[] preferinteBancnote;


    @Override
    public boolean[] getPreferinteBancnote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti preferintele pentru bancnote (0 - nu, 1 - da):");
        preferinteBancnote = new boolean[ValBancnota.values().length];

        System.out.println("Doriti bancnote de 50?");
        int input = scanner.nextInt();

        if (input == 1) {
            preferinteBancnote[0] = true;
        } else {
            preferinteBancnote[0] = false;
        }

        System.out.println("Doriti bancnote de 20?");
        int input2 = scanner.nextInt();

        if (input2 == 1) {
            preferinteBancnote[1] = true;
        } else {
            preferinteBancnote[1] = false;
        }

        System.out.println("Doriti bancnote de 10?");
        int input3 = scanner.nextInt();

        if (input3 == 1) {
            preferinteBancnote[2] = true;
        } else {
            preferinteBancnote[2] = false;
        }

        return preferinteBancnote;
    }
}
