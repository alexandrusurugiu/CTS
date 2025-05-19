package clase;

public class CreditScoreHandler extends LoanHandler {
    private static final int MIN_CREDIT_SCORE = 650;

    @Override
    public boolean isEligible(LoanApplication application) {
        if (application.getCreditScore() < MIN_CREDIT_SCORE) {
            System.out.println("Scorul de credit este prea mic pentru " + application.getApplicantName());
            return false;
        }
        System.out.println("Scor de credit OK pentru " + application.getApplicantName());
        return nextHandler == null || nextHandler.isEligible(application);
    }
}
