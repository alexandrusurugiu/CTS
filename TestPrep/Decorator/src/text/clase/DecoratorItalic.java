package text.clase;

public class DecoratorItalic extends DecoratorText {
    public DecoratorItalic(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<i>" + super.format() + "</i>";
    }
}
