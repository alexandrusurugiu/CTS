package text.clase;

public class DecoratorBold extends DecoratorText {
    public DecoratorBold(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<b>" + super.format() + "</b>";
    }
}
