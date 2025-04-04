package test;

import clase.SingletonThreadSafe;

public class ThreadSafeMain {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(SingletonThreadSafe::getInstance);
        Thread t2 = new Thread(SingletonThreadSafe::getInstance);

        t1.start();
        t2.start();

        t1.sleep(1000);

        t1.join();
        t2.join();
    }
}
