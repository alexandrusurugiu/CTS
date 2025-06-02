package document.clase;

public class Document implements IDocument {
    private String titlu;
    private String continut;
    private int nivelConfidentialitate;

    public Document(String titlu, String continut, int nivelConfidentialitate) {
        this.titlu = titlu;
        this.continut = continut;
        this.nivelConfidentialitate = nivelConfidentialitate;
    }

    @Override
    public void afiseazaContinut(User user) {
        System.out.println("Continut document '" + titlu +"':"+ continut);
    }

    @Override
    public String getTitlu() {
        return this.titlu;
    }

    @Override
    public int getNivelConfidentialitate() {
        return this.nivelConfidentialitate;
    }
}
