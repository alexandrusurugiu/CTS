package clase;

import java.util.Map;

public abstract class Filtrare {
    protected Filtrare nextHandler;

    public void setNextHandler(Filtrare nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean proceseaza(int suma, Map<ValBancnota, Integer> bancnoteDeExtras);
}
