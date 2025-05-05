package clase;

public class SingletonLazy {
    public static SingletonLazy instance;
    private int id;
    private String name;

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private SingletonLazy() {
    }

    @Override
    public String toString() {
        return "SingletonLazy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}