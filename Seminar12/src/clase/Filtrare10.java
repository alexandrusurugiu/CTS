package clase;

import java.util.Map;

public class Filtrare10 extends Filtrare {

    @Override
    public boolean proceseaza(int suma, Map<ValBancnota, Integer> bancnoteDeExtras) {
        int disponibil = Bancomat.getInstance().getNrBancnote(ValBancnota.B10);
        int maxBancnote = Math.min(suma / 10, disponibil);

        while (maxBancnote >= 0) {
            int sumaRamasa = suma - (maxBancnote * 10);
            if (maxBancnote > 0) {
                bancnoteDeExtras.put(ValBancnota.B10, maxBancnote);
            }
            if (sumaRamasa == 0) {
                return true;
            } else if (nextHandler != null && nextHandler.proceseaza(sumaRamasa, bancnoteDeExtras)) {
                return true;
            }
            if (maxBancnote > 0) {
                bancnoteDeExtras.remove(ValBancnota.B10);
            }
            maxBancnote--;
        }

        return nextHandler != null && nextHandler.proceseaza(suma, bancnoteDeExtras);
    }
}
