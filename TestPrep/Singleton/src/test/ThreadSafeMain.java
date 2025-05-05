package test;

import clase.SingletonThreadSafe;

import java.util.concurrent.Executors;

public class ThreadSafeMain {
    public static void main(String[] args) throws InterruptedException {

        var executors = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 2; i++) {
            executors.execute(() -> {
                try {
                    SingletonThreadSafe s1 = SingletonThreadSafe.getInstance();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }


        executors.shutdown();
    }
}
