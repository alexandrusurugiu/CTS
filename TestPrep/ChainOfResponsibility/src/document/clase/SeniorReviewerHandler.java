package document.clase;

public class SeniorReviewerHandler extends BaseDocumentHandler {
    @Override
    public void processHandler(Document document) {
        if (document.getComplexity() <= 5) {
            System.out.println("The senior reviewer has approved the document: " + document.getTitle());
        } else {
            System.out.println("The senior reviewer passed the document to the next reviewer...");
            passToNext(document);
        }
    }
}
