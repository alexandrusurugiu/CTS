package clase.export;

public class LegacyDocumentManager implements ILegacyDocumentManager {
    @Override
    public void printPlainText(String content) {
        System.out.println("Simple text document\n" + content);
    }
}
