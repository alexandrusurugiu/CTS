package clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private final Map<String, Sticker> stickers = new HashMap<>();
    private static volatile PrototypeFactory prototypeFactory;

    private PrototypeFactory() {
    }

    static {
        System.out.println("bloc static");
    }

    public Sticker createSticker(Masina masina) throws CloneNotSupportedException {
        String key = masina.getModelMasina() + masina.getAnFabricatie();

        if (stickers.containsKey(key)) {
            return stickers.get(key).clone();
        }

        var sticker = new Sticker(masina);

        stickers.put(key, sticker);
        return sticker.clone();
    }

    public static synchronized PrototypeFactory getInstance() {
        if (prototypeFactory == null) {
            prototypeFactory = new PrototypeFactory();
        }

        return prototypeFactory;
    }
}
