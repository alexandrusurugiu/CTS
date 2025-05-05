package adapter.clase;

public class EvaluareClient implements IEvaluareClient {
    @Override
    public double acordaDiscount(double discount) {
        if (discount > 100)
            return 0.25;
        return 0;
    }
}
