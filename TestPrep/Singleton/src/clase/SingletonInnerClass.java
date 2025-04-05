package clase;

public class SingletonInnerClass {

    private static class InnerClassHelper {
        private static SingletonInnerClass instance = new SingletonInnerClass();
    }

    private SingletonInnerClass() {
    }

    public static SingletonInnerClass getInstance() {
        return InnerClassHelper.instance;
    }
}
