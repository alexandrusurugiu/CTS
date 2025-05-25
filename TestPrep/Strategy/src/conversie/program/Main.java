package conversie.program;

import conversie.clase.Strategie;
import conversie.clase.StrategieEuro;
import conversie.clase.StrategieGBP;
import conversie.clase.StrategieUSD;

public class Main {
    public static void main(String[] args) {
        Strategie strategie = new Strategie();

        System.out.println("======Conversie euro-lei======");
        strategie.setConversieValutara(new StrategieEuro());
        System.out.println(strategie.efectueazaConversie(100));

        System.out.println("\n======Conversie lire-lei======");
        strategie.setConversieValutara(new StrategieGBP());
        System.out.println(strategie.efectueazaConversie(100));

        System.out.println("\n======Conversie dolari-lei======");
        strategie.setConversieValutara(new StrategieUSD());
        System.out.println(strategie.efectueazaConversie(100));
    }
}
