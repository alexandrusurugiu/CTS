package document.clase;

public abstract class BaseDocumentHandler implements DocumentHandler {
    private DocumentHandler nextHandler;

    @Override
    public void setNextHandler(DocumentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void passToNext(Document document) {
        if (nextHandler != null) {
            nextHandler.processHandler(document);
        } else {
            System.out.println("There are no more reviewers to evaluate the document!");
        }
    }
}
