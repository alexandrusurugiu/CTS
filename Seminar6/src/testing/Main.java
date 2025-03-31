package testing;

import models.BuilderSenzor;
import models.Senzor;

public class Main {
    public static void main(String[] args) {
        BuilderSenzor builder = new BuilderSenzor(20);
        Senzor senzor = (Senzor) builder.setCO(10).setCO2(20).setPM2_5(30).setPM10(40).setUmiditate(50).setVOC(60).build();
        System.out.println(senzor.toString());

        Senzor senzor2 = (Senzor) builder.setUmiditate(20).build();
        System.out.println(senzor2.toString());

        Senzor senzor3 = (Senzor) new BuilderSenzor(30).build();
        System.out.println(senzor3.toString());
    }
}
