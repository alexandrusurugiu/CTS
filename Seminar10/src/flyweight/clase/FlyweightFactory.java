package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static Map<Tip, FormaGeometrica> map = new HashMap<>();
    static {
        //Eager initialization
        map.put(Tip.CERC, new FormaGeometrica(Tip.CERC, "Cerc cu raza 5"));
        map.put(Tip.PATRAT, new FormaGeometrica(Tip.PATRAT, "Patrat cu latura 4"));
        map.put(Tip.TRIUNGHI, new FormaGeometrica(Tip.TRIUNGHI, "Triunghi cu laturile 3, 4, 5"));
    }

    public static FormaGeometrica getFormaGeometrica(Tip tip) {
        return map.get(tip);
    }
}
