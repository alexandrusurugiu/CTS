package program;

import clase.AbonamentLunar;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       AbonamentLunar a1 = AbonamentLunar.getInstance();
       AbonamentLunar a2 = AbonamentLunar.getInstance();

       AbonamentLunar[] a3 = {null};
       Thread t1 = new Thread(() -> a3[0] = AbonamentLunar.getInstance());

       t1.start();
       t1.join();

       a1.afiseazaAbonament();
       a2.afiseazaAbonament();
       a3[0].afiseazaAbonament();
    }
}