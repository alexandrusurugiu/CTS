package clase;


public class SingletonEager {
    public static SingletonEager instance = new SingletonEager(2);
    private int age;
    private String soi;
    private String color;

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getSoi() {
        return soi;
    }

    private void setSoi(String soi) {
        this.soi = soi;
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private SingletonEager(int age) {
        this.age = age;
    }

    public static SingletonEager getInstance() {
        instance.setColor("black");
        instance.setSoi("lalea");
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonEager{" +
                "age=" + age +
                ", soi='" + soi + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}