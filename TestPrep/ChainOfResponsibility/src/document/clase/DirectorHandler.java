package document.clase;

public class DirectorHandler extends BaseDocumentHandler{
    @Override
    public void processHandler(Document document) {
        System.out.println("The director approved the document: " + document.getTitle());
    }
}
