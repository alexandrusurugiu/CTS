package conversie.clase;

public class StrategieUSD implements ConversieValutara {
    private static final double USD = 4.95;

    @Override
    public double converteste(double suma) {
        return suma * USD;
    }
}
