package meniuri.clase;

import java.util.ArrayList;

public class StrategieCarbohidratiMinim implements IProcesabil {
    @Override
    public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu alegereMeniu = listaMeniuri.getFirst();
        for (OfertaMeniu oferta : listaMeniuri) {
            if (oferta.getNrCarbohidrati() < alegereMeniu.getNrCarbohidrati()) {
                alegereMeniu = oferta;
            }
        }

        return alegereMeniu;
    }
}
