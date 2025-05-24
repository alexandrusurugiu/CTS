package text.program;

import text.clase.*;

public class Main {
    public static void main(String[] args) {
        Text text = new TextSimplu("Hello World");
        System.out.println(text.format());
        DecoratorText decoratorBold = new DecoratorBold(text);
        System.out.println("\n" + decoratorBold.format());
        DecoratorText decoratorItalic = new DecoratorItalic(decoratorBold);
        System.out.println("\n" + decoratorItalic.format());
    }
}
