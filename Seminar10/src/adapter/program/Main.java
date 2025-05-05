package adapter.program;

import adapter.clase.*;

public class Main {
    public static void main(String[] args) {
        //Companie emag
        ICalculReducere emag = new CalculReducereEmag();
        Client client = new Client("Popescu", 1200);
        System.out.println("Reducere emag: " + emag.getReducere(client));

        //Companie XYZ
        IEvaluareClient xyz = new EvaluareClient();
        System.out.println(xyz.acordaDiscount(2000));

        //Dupa fuzionare folosind adapter
        IEvaluareClient xyz2 = new AdapterXYZtoEmag();
        System.out.println(xyz2.acordaDiscount(1670));
    }
}
