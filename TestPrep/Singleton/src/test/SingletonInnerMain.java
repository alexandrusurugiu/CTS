package test;

import clase.SingletonInnerClass;

public class SingletonInnerMain {
    public static void main(String[] args) {
        SingletonInnerClass s1 = SingletonInnerClass.getInstance();
        SingletonInnerClass s2 = SingletonInnerClass.getInstance();

        if (s1 == s2) {
            System.out.println("s1 is the same instance as s2");
        }
    }
}
