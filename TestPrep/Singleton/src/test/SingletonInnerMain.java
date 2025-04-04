package test;

import clase.SingletonInnerClass;

public class SingletonInnerMain {
    public static void main(String[] args) {
        SingletonInnerClass s1 = SingletonInnerClass.getInstance();
        SingletonInnerClass s2 = SingletonInnerClass.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        if (s1 == s2) {
            System.out.println("same instance");
        } else {
            System.out.println("different instance");
        }
    }
}
