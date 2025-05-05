package flyweight.program;

import flyweight.clase.FlyweightFactory;
import flyweight.clase.FormaGeometrica;
import flyweight.clase.Tip;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory.getFormaGeometrica(Tip.CERC).deseneaza(10, 20);
        FlyweightFactory.getFormaGeometrica(Tip.PATRAT).deseneaza(5, 2);
        FlyweightFactory.getFormaGeometrica(Tip.TRIUNGHI).deseneaza(1, 1);
    }
}
