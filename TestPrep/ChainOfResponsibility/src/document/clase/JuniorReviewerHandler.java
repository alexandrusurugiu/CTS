package document.clase;

public class JuniorReviewerHandler extends BaseDocumentHandler implements DocumentHandler {
    @Override
    public void processHandler(Document document) {
        if (document.getComplexity() <= 2) {
            System.out.println("\nThe junior reviewer has approved the document: " + document.getTitle());
        } else {
            System.out.println("\nThe junior reviewer passed the document to the next reviewer...");
            passToNext(document);
        }
    }
}
