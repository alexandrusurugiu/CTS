package meniuri.clase;

import java.util.ArrayList;

public class StrategieCaloriiMinim implements IProcesabil {
    @Override
    public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu alegereMeniu = listaMeniuri.getFirst();
        for (OfertaMeniu oferta: listaMeniuri) {
            if (oferta.getNrCalorii() < alegereMeniu.getNrCalorii()) {
                alegereMeniu = oferta;
            }
        }

        return alegereMeniu;
    }
}
