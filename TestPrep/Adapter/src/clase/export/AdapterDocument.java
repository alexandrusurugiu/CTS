package clase.export;

public class AdapterDocument extends ModernDocumentManager implements ILegacyDocumentManager{
    @Override
    public void printPlainText(String content) {
        this.exportAsHTML(content);
        this.exportAsHTML(content);
    }
}
