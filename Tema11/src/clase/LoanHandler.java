package clase;

public abstract class LoanHandler {
    protected LoanHandler nextHandler;

    public void setNextHandler(LoanHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean isEligible(LoanApplication application);
}
