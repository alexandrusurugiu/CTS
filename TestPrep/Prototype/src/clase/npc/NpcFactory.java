package clase.npc;

import java.util.HashMap;
import java.util.Map;

public class NpcFactory {
    private static final Map<String, Npc> npc = new HashMap<>();

    static {
        npc.put("merchant", new Merchant());
        npc.put("guide", new Guide());
    }

    public static Npc getNpc(String type) throws CloneNotSupportedException {
        Npc prototype = npc.get(type);

        if (prototype == null) {
            throw new RuntimeException("No Npc found for type " + type);
        }

        return prototype.clone();
    }

    public static void addPrototype(String key, Npc prototype) {
        npc.put(key, prototype);
    }
}
