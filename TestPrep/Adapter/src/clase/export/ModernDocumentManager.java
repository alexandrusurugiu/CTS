package clase.export;

public class ModernDocumentManager implements IModernDocumentManager {
    @Override
    public void exportAsHTML(String content) {
        System.out.println("<html><body><p>" + content + "</p></body></html>");
    }

    @Override
    public void exportAsJSON(String content) {
        System.out.println("{ \"content\": \"" + content + "\" }");
    }
}
