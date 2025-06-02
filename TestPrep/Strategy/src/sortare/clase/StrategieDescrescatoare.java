package sortare.clase;


import java.util.ArrayList;
import java.util.Collections;

public class StrategieDescrescatoare implements ISortare {

    @Override
    public void sorteaza(ArrayList<Integer> elemente) {
        Collections.sort(elemente,  Collections.reverseOrder());
    }
}
