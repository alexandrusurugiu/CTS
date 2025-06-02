package text.clase;

public abstract class DecoratorText extends Text {
    protected Text text;

    public DecoratorText(Text text) {
        this.text = text;
    }

    @Override
    public String format() {
        return text.format();
    }
}
