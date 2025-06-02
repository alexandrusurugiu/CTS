package conversie.clase;

public class StrategieGBP implements ConversieValutara {
    private static final double GBP = 5.7;

    @Override
    public double converteste(double suma) {
        return suma * GBP;
    }
}
