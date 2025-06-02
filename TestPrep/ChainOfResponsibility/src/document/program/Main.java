package document.program;

import document.clase.*;

public class Main {
    public static void main(String[] args) {
        BaseDocumentHandler juniorReviewer = new JuniorReviewerHandler();
        BaseDocumentHandler seniorReviewer = new SeniorReviewerHandler();
        BaseDocumentHandler director = new DirectorHandler();

        Document doc = new Document("Simple report", 1);
        Document doc2 = new Document("Medium project", 4);
        Document doc3 = new Document("Complex strategy", 8);

        Firm firm = new Firm(juniorReviewer, seniorReviewer, director);
        firm.processDocument(doc);
        firm.processDocument(doc2);
        firm.processDocument(doc3);
    }
}
