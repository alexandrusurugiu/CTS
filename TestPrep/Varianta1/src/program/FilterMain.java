package program;

import clase.SearchingFilter;
import clase.SearchingFilterBuilder;

public class FilterMain {
    public static void main(String[] args) {
        SearchingFilter filter = new SearchingFilterBuilder().setGen("comedie").setAnAparitie(1977).addActor("Sergiu Nicolaescu").build();
        SearchingFilter filter2 = new SearchingFilterBuilder().setRating(5).setTitlu("Pistruiatul").build();

        System.out.println("\n==========Filtre==========\n");
        System.out.println(filter);
        System.out.println(filter2);
    }
}
