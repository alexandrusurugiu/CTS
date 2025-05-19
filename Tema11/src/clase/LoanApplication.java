package clase;

public class LoanApplication {
    private String applicantName;
    private int creditScore;
    private double annualIncome;
    private boolean isEmployed;

    public LoanApplication(String applicantName, int creditScore, double annualIncome, boolean isEmployed) {
        this.applicantName = applicantName;
        this.creditScore = creditScore;
        this.annualIncome = annualIncome;
        this.isEmployed = isEmployed;
    }

    public String getApplicantName() {
        return applicantName;
    }
    public int getCreditScore() {
        return creditScore;
    }
    public double getAnnualIncome() {
        return annualIncome;
    }
    public boolean isEmployed() {
        return isEmployed;
    }

    @Override
    public String toString() {
        return "LoanApplication{" +
                "applicantName='" + applicantName + '\'' +
                ", creditScore=" + creditScore +
                ", annualIncome=" + annualIncome +
                ", isEmployed=" + isEmployed +
                '}';
    }
}
