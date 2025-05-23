package document.clase;

public interface DocumentHandler {
    void setNextHandler(DocumentHandler nextHandler);
    void processHandler(Document document);
}
