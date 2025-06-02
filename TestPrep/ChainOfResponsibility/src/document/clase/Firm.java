package document.clase;

public class Firm {
    private BaseDocumentHandler juniorReviewer;
    private BaseDocumentHandler seniorReviewer;
    private BaseDocumentHandler director;

    public Firm(BaseDocumentHandler juniorReviewer, BaseDocumentHandler seniorReviewer, BaseDocumentHandler director) {
        this.juniorReviewer = juniorReviewer;
        this.seniorReviewer = seniorReviewer;
        this.director = director;

        this.juniorReviewer.setNextHandler(seniorReviewer);
        this.seniorReviewer.setNextHandler(director);
    }

    public void processDocument(Document document) {
        this.juniorReviewer.processHandler(document);
    }
}
