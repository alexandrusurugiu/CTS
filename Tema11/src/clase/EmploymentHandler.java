package clase;

public class EmploymentHandler extends LoanHandler {
    @Override
    public boolean isEligible(LoanApplication application) {
        if (!application.isEmployed()) {
            System.out.println("Aplicantul nu este angajat: " + application.getApplicantName());
            return false;
        }
        System.out.println("Aplicantul este angajat: " + application.getApplicantName());

        if (nextHandler == null)
            return true;
        else
            return nextHandler.isEligible(application);
    }
}
