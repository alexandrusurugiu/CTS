package conversie.clase;

public class StrategieEuro implements ConversieValutara {
    private static final double EUR = 5.01;

    @Override
    public double converteste(double suma) {
        return suma * EUR;
    }
}
