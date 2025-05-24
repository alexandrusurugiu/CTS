package document.program;

import document.clase.Document;
import document.clase.DocumentProxy;
import document.clase.IDocument;
import document.clase.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", 1);
        User user2 = new User("Costica", 3);
        User user3 = new User("Ionica", 5);
        User user4 = new User("Danut", 7);

        Document document = new Document("Proclamatie", "istoric", 1);
        Document document2 = new Document("Atestat", "legal", 5);
        Document document3 = new Document("Reguli", "uz normal", 7);
        Document document4 = new Document("Partitura", "muzica", 3);

        //inainte de proxy
//        document.afiseazaContinut(user1);
//        document2.afiseazaContinut(user2);
//        document3.afiseazaContinut(user3);
//        document4.afiseazaContinut(user4);

        //dupa proxy
        IDocument proxy = new DocumentProxy(document);
        IDocument proxy2 = new DocumentProxy(document2);
        IDocument proxy3 = new DocumentProxy(document3);
        IDocument proxy4 = new DocumentProxy(document4);

        proxy.afiseazaContinut(user2);
        proxy2.afiseazaContinut(user4);
        proxy3.afiseazaContinut(user4);
        proxy4.afiseazaContinut(user3);
    }
}
