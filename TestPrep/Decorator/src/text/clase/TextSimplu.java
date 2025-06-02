package text.clase;

public class TextSimplu extends Text {
    private String content;

    public TextSimplu(String content) {
        this.content = content;
    }

    @Override
    public String format() {
        return content;
    }
}
