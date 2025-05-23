package document.clase;

public class Document {
    private String title;
    private int complexity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public Document(String title, int complexity) {
        this.title = title;
        this.complexity = complexity;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", complexity=" + complexity +
                '}';
    }
}
