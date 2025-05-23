package program;

import clase.client.*;
import clase.export.*;
import clase.schimb_valutar.*;

public class Main {
    public static void main(String[] args) {
        //Firma
        IEvaluareClientFirmaA evaluareA = new EvaluareClientFirmaA();
        evaluareA.analizaClientFirmaA(2500);

        IEvaluareClientFirmaB evaluareB = new EvaluareClientFirmaB();
        int[] costEvenimente = new int[]{100, 2000, 20000, 1000, 5000};
        Client client = new Client("Andrei", 5, costEvenimente);
        evaluareB.analizaClientFirmaB(client);

        IEvaluareClientFirmaB evaluareB2 = new AdaptorEvaluareClient();
        int[] costEvenimente2 = new int[]{100, 2000, 20000, 1000, 5000};
        Client client2 = new Client("Andrei", 5, costEvenimente2);
        evaluareB2.analizaClientFirmaB(client2);



        //Payment
        INewPaymentSystem newPaymentSystem = new NewPaymentSystem();
        newPaymentSystem.payInEUR(2500);

        IOldPaymentSystem oldPaymentSystem = new OldPaymentSystem();
        oldPaymentSystem.payInUSD(2500);

        IOldPaymentSystem oldPaymentSystem2 = new AdapterPayment();
        oldPaymentSystem2.payInUSD(2500);



        //Document
        ILegacyDocumentManager legacyDocument = new LegacyDocumentManager();
        legacyDocument.printPlainText("Legacy document text");

        IModernDocumentManager modernDocument = new ModernDocumentManager();
        modernDocument.exportAsHTML("HTML modern document");
        modernDocument.exportAsJSON("JSON modern document");

        ILegacyDocumentManager adapterDocument = new AdapterDocument();
        adapterDocument.printPlainText("Legacy adapter document");
    }
}