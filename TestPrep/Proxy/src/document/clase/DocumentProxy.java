package document.clase;

public class DocumentProxy implements IDocument {
    private Document document;

    public DocumentProxy(Document document) {
        this.document = document;
    }

    @Override
    public void afiseazaContinut(User user) {
        if (user.getNivelAcces() < document.getNivelConfidentialitate()) {
            throw new RuntimeException("Userul nu are gradul necesar pentrua a putea vizualiza continutul documentului: " + document.getTitlu());
        } else {
            document.afiseazaContinut(user);
            logAccess(user);
        }
    }

    private void logAccess(User user) {
        System.out.println("[LOG] User '" + user.getNume() + "' a accesat documentul '" + document.getTitlu() + "'");
    }

    @Override
    public String getTitlu() {
        return document.getTitlu();
    }

    @Override
    public int getNivelConfidentialitate() {
        return document.getNivelConfidentialitate();
    }
}
