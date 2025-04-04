package clase;

public class SingletonInnerClass {
    private int id;
    private String name;

    private SingletonInnerClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public static SingletonInnerClass getInstance() {
        return SingletonHelper.instance;
    }

    @Override
    public String toString() {
        return "SingletonInnerClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static class SingletonHelper {
        private static final SingletonInnerClass instance = new SingletonInnerClass(1, "Alex");
    }
}
