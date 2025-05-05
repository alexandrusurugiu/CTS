package test;

import clase.SingletonEager;

public class EagerMain {
    public static void main(String[] args) {
        SingletonEager eager = SingletonEager.getInstance();
        SingletonEager eager2 = SingletonEager.getInstance();

        System.out.println(eager);

        if (eager == eager2) {
            System.out.println("Sunt aceeasi instanta");
        } else {
            System.out.println("Nu sunt aceeasi instanta");
        }
    }
}
