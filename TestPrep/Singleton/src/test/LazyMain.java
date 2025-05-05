package test;

import clase.SingletonLazy;

public class LazyMain {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazy lazy2 = SingletonLazy.getInstance();

        if (lazy == lazy2) {
            System.out.println("Sunt aceeasi instanta");
        } else {
            System.out.println("Nu sunt aceeasi instanta");
        }
    }
}