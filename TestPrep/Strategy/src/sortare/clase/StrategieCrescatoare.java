package sortare.clase;

import java.util.ArrayList;
import java.util.Collections;

public class StrategieCrescatoare implements ISortare {

    @Override
    public void sorteaza(ArrayList<Integer> elemente) {
        Collections.sort(elemente);
    }
}
