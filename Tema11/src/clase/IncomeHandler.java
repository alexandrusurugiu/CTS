package clase;

public class IncomeHandler extends LoanHandler {
    private static final double MIN_INCOME = 25000;

    @Override
    public boolean isEligible(LoanApplication application) {
        if (application.getAnnualIncome() < MIN_INCOME) {
            System.out.println("Venitul este insuficient pentru " + application.getApplicantName());
            return false;
        }
        System.out.println("Venit OK pentru " + application.getApplicantName());
        return nextHandler == null || nextHandler.isEligible(application);
    }
}
