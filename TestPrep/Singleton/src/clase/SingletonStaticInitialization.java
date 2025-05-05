package clase;

public class SingletonStaticInitialization {
    public static SingletonStaticInitialization instance;
    private double temperature;
    private int humidity;

    static {
        instance = new SingletonStaticInitialization(45.87);
        instance.humidity = 5;
    }

    public double getTemperature() {
        return temperature;
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    private void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    private SingletonStaticInitialization(double temperature) {
        this.temperature = temperature;
    }

    public static SingletonStaticInitialization getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonStaticInitialization{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
