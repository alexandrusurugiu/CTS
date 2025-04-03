package clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static Restaurant instance;     //cream instanta pentru clasa noastra - daca vreau EAGER o initializez aici folosind constructorul
//    private static volatile Restaurant instance;      //asta este pentru thread safe -
    private String name;
    private List<Ospatar> ospatari;

    public Restaurant(String name) {
        this.name = name;
        this.ospatari = new ArrayList<Ospatar>();
    }

    //Metoda LAZY - initializarea se face mai tarziu
    public static Restaurant getInstance() {
        if (instance == null) {
            //date preluate din surse externe
            instance = new Restaurant("Mc Donalds");
        }

        return instance;
    }

//    Asta este tot pentru thread safe, este obligatorie combinatie syncronized si volatile
//    public synchronized static Restaurant getInstance() {
//        if (instance == null) {
//            //date preluate din surse externe
//            instance = new Restaurant("Mc Donalds");
//        }
//
//        return instance;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ospatar> getOspatari() {
        return ospatari;
    }

    public void addOspatari(Ospatar ospatar) {
        this.ospatari.add(ospatar);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", ospatari=" + ospatari +
                '}';
    }
}
