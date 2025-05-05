package test;

import clase.SingletonStaticInitialization;

public class StaticInitializationMain {
    public static void main(String[] args) {
        SingletonStaticInitialization s1 = SingletonStaticInitialization.getInstance();
        SingletonStaticInitialization s2 = SingletonStaticInitialization.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        if (s1 == s2) {
            System.out.println("It's the same instance");
        } else {
            System.out.println("It's not the same instance");
        }
    }
}
