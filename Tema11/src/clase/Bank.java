package clase;

public class Bank {
    private LoanHandler creditScoreHandler;
    private LoanHandler employmentHandler;
    private LoanHandler incomeHandler;

    public Bank(LoanHandler creditScoreHandler, LoanHandler employmentHandler, LoanHandler incomeHandler) {
        this.creditScoreHandler = creditScoreHandler;
        this.employmentHandler = employmentHandler;
        this.incomeHandler = incomeHandler;

        creditScoreHandler.setNextHandler(employmentHandler);
        employmentHandler.setNextHandler(incomeHandler);
    }

    public boolean processLoan(LoanApplication application) {
        System.out.println("\nProcesare cerere pentru: " + application.getApplicantName());
        return creditScoreHandler.isEligible(application);
    }
}
